// Factorial of a number
object Factorial {
  def factorial(n: Int): Int = {
    if (n==0) 1
    else n * factorial(n-1)
  }
  def main(args: Array[String]): Unit = {
    val number = 9
    val result = factorial(number)
    println(s"factorial of $number is $result")
  }
}

/*
Output:
factorial of 9 is 362880
*/
