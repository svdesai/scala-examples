// Function to check if a number is Prime
object CheckPrime {
  def isPrime(n: Int): Boolean = {
    if (n<=1) false
    else (2 until Math.sqrt(n).toInt + 1).forall(n % _ != 0)
  }
  def main(args: Array[String]): Unit = {
    val number = 7
    val result = isPrime(number)
    println(s"$number is prime? : $result")
  }
}

/*
Output:
7 is prime? : true
*/
