object Classes extends App {

  class Greeting {
    def sayHi(name: String): Unit =
      println(s"Hello $name this is the new sbt-microsites Layouts")
  }

  class Person(name: String, age: Int) {
    def summary: Unit =
      println(s"$name is $age years old")
  }

  val paolo = new Person("Paolo", 40)
  paolo.summary

}
