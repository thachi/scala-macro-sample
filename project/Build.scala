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
      scalacOptions += "-deprecation"
    )
  ).dependsOn(macrolib)


  lazy val macrolib = Project(
    id = "macro",
    base = file("macro"),
    settings = Seq(
      name := "macro-library",
      scalaVersion := "2.11.2",
      libraryDependencies ++= Seq(
        "org.scala-lang" % "scala-reflect" % "2.11.4"
      )
    )
  )


}
