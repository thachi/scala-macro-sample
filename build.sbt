import Dependencies._

ThisBuild / scalaVersion     := "2.11.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-macro-sample",
    scalacOptions += "-language:experimental.macros",
    libraryDependencies += scalaTest % Test
  )
  .aggregate(use, macrolib)
  .dependsOn(use)

lazy val use = (project in file("use"))
  .settings(
    name := "use",
    scalacOptions += "-deprecation",
    libraryDependencies += scalaTest % Test
  )
  .dependsOn(macrolib)

  lazy val macrolib = (project in file("macro"))
  .settings(
    name := "use",
    scalacOptions += "-language:experimental.macros",
    libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.11.4",
    libraryDependencies += scalaTest % Test
  )
