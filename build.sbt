lazy val kernel = (project in file("kernel")).settings(
  organization := "tf.bug",
  name := "cordless-kernel",
  version := "0.1.0",
  scalaVersion := "2.13.1",
  libraryDependencies ++= Seq(
    "org.typelevel" %% "spire" % "0.17.0-M1",
    "org.typelevel" %% "cats-tagless-macros" % "0.11",
  ),
)

lazy val core = (project in file("core")).settings(
  organization := "tf.bug",
  name := "cordless-core",
  version := "0.1.0",
  scalaVersion := "2.13.1",
  libraryDependencies ++= Seq(
    "org.typelevel" %% "cats-core" % "2.1.1",
    "org.typelevel" %% "cats-effect" % "2.1.2",
    "co.fs2" %% "fs2-core" % "2.3.0",
    "org.http4s" %% "http4s-core" % "0.21.3",
    "org.http4s" %% "http4s-blaze-client" % "0.21.3",
    "org.http4s" %% "http4s-jdk-http-client" % "0.3.0",
  ),
  addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full),
).dependsOn(kernel)
