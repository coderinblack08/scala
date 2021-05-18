object Tuples {
  def main(args: Array[String]) = {
    var ingredients = ("flour", 25)
    println(ingredients._1, ingredients._2) // access first and second elements

    val (name, quantity) = ingredients // pattern match this baby
    println(name)
    println(quantity)

    val planets =
      List(
        ("Mercury", 57.9),
        ("Venus", 108.2),
        ("Earth", 149.6),
        ("Mars", 227.9),
        ("Jupiter", 778.3)
      )
    planets.foreach {
      case ("Earth", distance) =>
        println(s"Our planet is $distance million kilometers from the sun")
      case _ =>
    }

    val numPairs = List((2, 5), (3, -7))
    for ((a, b) <- numPairs) println(a * b) // pattern match inside for

    case class Planet(name: String, distance: Double)

    /** case classes are like struts in c/c++, you could use tuples most
      *    of the times to replace them but case classes improve readability
      */
  }
}
