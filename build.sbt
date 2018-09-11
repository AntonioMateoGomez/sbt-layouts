name := "sbt-layouts"

version := "0.1"

scalaVersion := "2.12.6"

lazy val docs = project
  .in(file("docs"))
  .enablePlugins(MicrositesPlugin)
  .settings(
    micrositeName := "sbt-layout",
    micrositeDescription := "A testing project to try out new Layouts.",
    homepage := Some(url("https://github.com/AntonioMateoGomez/sbt-layouts")),
    micrositeAuthor := "Antonio Mateo",
    micrositeGithubOwner := "AntonioMateoGomez",
    micrositeGithubRepo := "sbt-layouts",
    micrositeDocumentationUrl := "docs.html",
    micrositeOrganizationHomepage := "http://www.47deg.com",
    micrositeTwitterCreator := "aMateoPaolo",
    micrositePalette := Map(
          "brand-primary"     -> "#3FBABD",
          "brand-secondary"   -> "#24c199",
          "brand-tertiary"    -> "#399289",
          "gray-dark"         -> "#453E46",
          "gray"              -> "#837F84",
          "gray-light"        -> "#E3E2E3",
          "gray-lighter"      -> "#F4F3F4",
          "white-color"       -> "#FFFFFF")
  )
  .dependsOn(main)

lazy val main = project.in(file("main"))