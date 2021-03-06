lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6"
    )),
    name := "FizzBuzz-demo"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
