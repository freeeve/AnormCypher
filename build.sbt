name := "AnormCypher"
 
version := "0.1"
 
scalaVersion := "2.9.2"

resolvers += "codahale" at "http://repo.codahale.com/"
 
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.8" % "test",
  "net.databinder.dispatch" %% "dispatch-core" % "0.9.2",
  "com.codahale" % "jerkson_2.9.1" % "0.5.0"
)
