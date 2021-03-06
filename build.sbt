name := "morph"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.2"

scalacOptions := Seq(
  "-unchecked", "-deprecation", "-feature", "-Xfatal-warnings"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "org.parboiled" %% "parboiled-scala" % "1.1.5"
)

initialCommands in console := """
  |import morph.ast._
  |import morph.ast.Implicits._
  |import morph.ast.DSL._
  |import morph.parser._
  |import morph.parser.Interface._
  |import morph.extractor.Interface._
  |import morph.utils.Utils._
  """.stripMargin

site.settings

site.includeScaladoc()

site.pamfletSupport()

ghpages.settings

git.remoteRepo := "https://github.com/stucco/morph.git"