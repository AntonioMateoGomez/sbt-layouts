object forComprehension extends App{

  class FunctionA {
    def stringLength(s: String): Option[Int] = s match {
      case ""    => None
      case value => Option(value).map(_.length)
    }
  }

  class FunctionB {
    def isEven(i: Int): Option[Boolean] = i match {
      case value if value % 2 == 0 => Some(true)
      case _                       => Some(false)
    }
  }

}
