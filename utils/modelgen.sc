#!/usr/bin/env amm

/*
 * quick one-off script to generate first sketch of model
 * does not regenerate file if it exists
 * so far it's not automated (unsure if it's even desired)
 *
 * @todo: so far does not generate anything optional, recheck how AvaTax cares
 */

import java.io.File
import java.nio.file.{Paths, Files}
import java.nio.charset.StandardCharsets

// point to location where AvaTax is checked out
val dir = new File("/tmp/AvaTax-REST-V2-JRE-SDK/src/main/java/net/avalara/avatax/rest/client/models")
val resultPath = "/tmp/models/"

def getListOfFiles(dir: File, extensions: List[String]): List[File] = {
    dir.listFiles.filter(_.isFile).toList.filter { file =>
        extensions.exists(file.getName.endsWith(_))
    }
}

def toScalaTpe(s:String):String = {
  s.replaceAll("<", "[").replaceAll(">", "]")
    .replaceAll("ArrayList", "List")
    .replaceAll("HashMap", "Map")
    .replaceAll("Integer", "Int")
}

final case class Member(fieldType:String, fieldName:String, defaultVal:Option[String] = None) {
  def defVal = defaultVal.fold("")(x => s" = $x")

  // put ticks behind reserved words
  private def tickReserved(s:String):String = {
    val res = Set("type")
    res.fold(s) {
      case (ss, r) if ss == r => ss.replaceAll(r, s"`$r`")
      case (ss, _) => ss
    }
  }

  override def toString:String = s"${tickReserved(fieldName)}:$fieldType$defVal"
}
final case class CaseClass(name:String, members:List[Member])


def extractMembers(f:File):CaseClass = {
  val members = scala.io.Source.fromFile(f, "UTF-8")
    .getLines
    .filterNot(_.contains("*")) // comments
    .map(_.trim.replaceAll(";", " "))
    .map(toScalaTpe)
    .map(_.split("\\s+(?![^\\[]*\\])")) //private Integer id; also take care of spaces in generic types
    .filter(x => x.length == 3 && x.head == "private")
    .map(_.drop(1)) // modifier 'private'
    .map(xs => Member(xs.head, xs.last))
    .toList

  val ccName = f.getName.substring(0, f.getName.lastIndexOf('.'))

  CaseClass(ccName, members)
}

def serialize(c:CaseClass):String = {
    s"""|package org.upstartcommerce.avataxsdk.core.data.models
      |import java.sql.Date
      |import org.upstartcommerce.avataxsdk.core.data.enums._
      |
      |final case class ${c.name}${c.members.mkString("(", ", ", ")")}
  """.stripMargin
}

val files = getListOfFiles(dir, List("java"))
val ccs = files.map(extractMembers)

ccs.foreach { x =>
  val ser = serialize(x)
  val path = s"$resultPath/${x.name}.scala"
  if (! new File(path).exists) {
    println(s"writing $path")
    Files.write(Paths.get(path), ser.getBytes(StandardCharsets.UTF_8))
  } else {
    println(s"${x.name} exists, skipping")
  }
}

