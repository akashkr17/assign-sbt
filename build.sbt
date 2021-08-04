import  Dependencies.{Libraries, commonModuleDependencies, actorModuleDependencies }
import  CommonSettings._

name := "sbt-assign"
version := "0.1"
scalaVersion := "2.12.12"

lazy val root = project.in(file("."))
  .aggregate(common, actor)

lazy val common = (
  baseProject("common")
  settings(libraryDependencies ++= commonModuleDependencies)
)

lazy val actor = (
  baseProject("actor")
      .dependsOn(common)
    settings(libraryDependencies ++= actorModuleDependencies )


  )