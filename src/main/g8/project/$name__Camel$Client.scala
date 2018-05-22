import sbt._
import sbt.Keys._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import org.scalajs.sbtplugin.ScalaJSPlugin


object $name;format="Camel"$Client {
  private[this] val clientSettings = $name;format="Camel"$Shared.commonSettings ++ Seq(
    name := "$name;format="Camel"$Client",
    // use Scala.js provided launcher code to start the client app
    scalaJSUseMainModuleInitializer := true,
    scalaJSStage in Global := FastOptStage,
    scalaVersion := "$scala_version_for_js$",
    libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "utest" % "0.6.3" % "test"
    ),
    testFrameworks += new TestFramework("utest.runner.Framework")
  )

  lazy val $name;format="camel"$Client = (project in file("$name;format="norm"$-client"))
    .settings(clientSettings: _*)
    .enablePlugins(ScalaJSPlugin)
    .dependsOn($name;format="Camel"$Shared.sharedJs)
}