lazy val kernel = (project in file("kernel")).settings(
  organization := "tf.bug",
  name := "cordless-kernel",
  version := "0.1.0",
  scalaVersion := "2.13.1",
  libraryDependencies ++= Seq(
    "org.typelevel" %% "spire" % "0.17.0-M1",
  ),
)

lazy val core = (project in file("core")).settings(
  organization := "tf.bug",
  name := "cordless-core",
  version := "0.1.0",
  scalaVersion := "2.13.1",
)
