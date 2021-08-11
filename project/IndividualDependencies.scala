import sbt._

object IndividualDependencies {
  private final val AwsSdkVersion = "1.11.702"

  lazy val aws = Seq(
    "com.amazonaws" % "aws-java-sdk-athena" % AwsSdkVersion
  )
}
