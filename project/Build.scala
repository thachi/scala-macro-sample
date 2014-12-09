import sbt._

object ScalaMacroSampleBuild extends Build {

  import Keys._

  lazy val root = Project(
    id = "scala-macro-sample",
    base = file("."),
    settings = Seq(
      scalaVersion := "2.11.4",
      scalacOptions += "-language:experimental.macros",
      resolvers += Resolver.sonatypeRepo("snapshots"),
      resolvers += Resolver.sonatypeRepo("releases")
    )
  )
    .aggregate(use, macrolib)
    .dependsOn(use)

  lazy val use = Project(
    id = "use",
    base = file("use"),
    settings = Seq(
      scalaVersion := "2.11.4",
      scalacOptions += "-deprecation",
      libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "2.2.2" % "test"
      )
    )
  ).dependsOn(macrolib)


  lazy val macrolib = Project(
    id = "macro",
    base = file("macro"),
    settings = Seq(
      name := "macro-library",
      scalaVersion := "2.11.4",
      scalacOptions += "-language:experimental.macros",
      libraryDependencies ++= Seq(
        "org.scala-lang" % "scala-reflect" % "2.11.4"
      )
    )
  )


}
