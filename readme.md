# Avatax Client

Pure Scala library for interaction with Avatax APIs.

Project is split into following modules:

- core - Zero-dependency project - Scala ADT of data transfer objects. Based on docs & [official sdk](https://github.com/avadev/AvaTax-REST-V2-JRE-SDK).
- client - akka-http + play-json client for AvaTax
- play-json - formats and derivation for AvaTax data types

### Installation

Add following to your build.sbt
```
libraryDependencies += "TODO"
```

### Compilation

First full compilation will take a long time (+-10minutes) due to huge amount of  api surface area - data types available, for which json has to be derived.
Followup incremental compilations should be fast.

### Look ahead

Currently client is hardcoded to both akka-http and play-json. Especially with json we may swap it down the line (it's a separate module already).