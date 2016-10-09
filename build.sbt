name := "netlib-native-test"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "com.github.fommil.netlib" % "all" % "1.1.2"

libraryDependencies += "org.scalanlp" % "breeze_2.11" % "0.12"

mainClass in (Compile, run) := Some("test.Main")

