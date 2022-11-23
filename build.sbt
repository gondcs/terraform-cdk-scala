lazy val root = project
  .in(file("."))
  .settings(
    name := "hello-world",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.2.1",
    libraryDependencies ++= Seq(
      "com.hashicorp" % "cdktf" % "0.14.1",
      "software.constructs" % "constructs" % "10.1.165",

      // providers
      //"com.hashicorp" % "cdktf-provider-aws" % "11.0.0",
      "com.hashicorp" % "cdktf-provider-docker" % "4.0.0",

      // testing
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
