object Main extends App {
  println("Hello, World!")
}

class Greeting {
  def sayHi(name: String): Unit =
    println(s"Hello $name")
}