organization := "io.github.isuzuki"

name := "scala-circleci2"

version := "0.1"

scalaVersion := "2.12.4"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-target:jvm-1.8"
)

test in assembly := {}