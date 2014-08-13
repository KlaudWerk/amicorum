import play.PlayScala

name := "amicorum"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "com.typesafe.play.plugins" %% "play-plugins-mailer" % "2.3.0",
  "ws.securesocial" %% "securesocial" % "master-SNAPSHOT"
)
// resolves repos from oss.sonatype.org

resolvers += Resolver.sonatypeRepo("snapshots")
