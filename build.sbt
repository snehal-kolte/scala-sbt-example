import IndividualDependencies.aws

lazy val root = (project in file("."))
  .settings(
    inThisBuild(
      List(
        organization := "scala-sbt-example",
        scalaVersion := "2.12.14",
      )
    ),
    libraryDependencies ++= aws,
  )
