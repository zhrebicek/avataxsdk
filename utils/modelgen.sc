#!/usr/bin/env amm

/*
 * quick & dirty one-off script to generate first sketch of model
 * does not regenerate file if it exists
 * so far it's not automated (unsure if it's even desired)
 *
 * there are far better ways to generate scala api should we want something more useful
 * down the road
 *
 * @todo: so far does not generate anything optional, recheck how AvaTax cares
 */

import java.io.File
import java.nio.file.{Paths, Files}
import java.nio.charset.StandardCharsets

// point to location where AvaTax is checked out
val dir = new File("/tmp/AvaTax-REST-V2-JRE-SDK/src/main/java/net/avalara/avatax/rest/client/models")
val resultPath = "/tmp/models/"

def upperCaseFirstLetter(s:String):String = Character.toUpperCase(s.charAt(0)) + s.substring(1)
def lowerCaseFirstLetter(s:String):String = Character.toLowerCase(s.charAt(0)) + s.substring(1)

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

// put ticks behind reserved words
def tickReserved(s:String):String = {
  val res = Set("type")
  res.fold(s) {
    case (ss, r) if ss == r => ss.replaceAll(r, s"`$r`")
    case (ss, _) => ss
  }
}

final case class Member(fieldType:String, fieldName:String, defaultVal:Option[String] = None, originalType:String) {
  def defVal = defaultVal.fold("")(x => s" = $x")

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
    .map{ xs =>
      val tpe = xs.head
      val (tpe2, defaultVal, originalTpe) = (s"Option[$tpe]", s"None", tpe)
    // do not put lists and maps into optional
/*        if (tpe.startsWith("List")) (tpe, "List.empty", tpe)
        else if (tpe.startsWith("Map")) (tpe, "Map.empty", tpe)
        else (s"Option[$tpe]", s"None", tpe)*/

      val symbol = xs.last
      Member(tpe2, fieldName = symbol, defaultVal = Some(defaultVal), originalType = originalTpe)
    }
    .toList

  val ccName = f.getName.substring(0, f.getName.lastIndexOf('.'))

  CaseClass(ccName, members)
}

def serialize(c:CaseClass):String = {
  val withs = c.members.map { m =>
    val wrapped = if (m.fieldType.startsWith("Option")) "Some(value)" else "value"
    val upper = upperCaseFirstLetter(m.fieldName)
      s"  def with$upper(value:${tickReserved(m.originalType)}):${c.name} = copy(${tickReserved(m.fieldName)} = $wrapped)"
  }.mkString("\n")

  val accessors = c.members.map { m =>
    if (m.originalType.startsWith("List")) Some(s"  lazy val ${m.fieldName}Raw:${m.originalType} = ${m.fieldName}.getOrElse(List.empty)")
    else if (m.originalType.startsWith("Map")) Some(s"  lazy val ${m.fieldName}Raw:${m.originalType} = ${m.fieldName}.getOrElse(Map.empty)")
    else None
  }.collect { case Some(x) => x }.mkString("\n")

    s"""|package org.upstartcommerce.avataxsdk.core.data.models
      |import java.sql.Date
      |import org.upstartcommerce.avataxsdk.core.data.enums._
      |
      |final case class ${c.name}${c.members.mkString("(", ", ", ")")} {
      |$accessors
      |$withs
      |}
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

// play json format
val jsStr = ccs.map { x =>
    val (prefix, impl) = if (x.members.size > 22) ("/* over 22 fields */ ", "???") else ("", s"Json.format[${x.name}]")
    val lower = lowerCaseFirstLetter(x.name)
    s"${prefix}implicit val ${lower}OFormat: OFormat[${x.name}] = $impl"
  }.mkString("\n")

val jsonPath = s"$resultPath/play-format.txt"
Files.write(Paths.get(jsonPath), jsStr.getBytes(StandardCharsets.UTF_8))

