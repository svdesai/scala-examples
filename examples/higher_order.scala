object HigherOrderFn {
  def square(x: Int):   Int = x*x
  
  def main(args: Array[String]) : Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    val squares = numbers.map(square)
    println(s"original: $numbers")
    print(s"squares: $squares")
  }
}

/*
Output:

original: List(1, 2, 3, 4, 5)
squares: List(1, 4, 9, 16, 25)
*/
