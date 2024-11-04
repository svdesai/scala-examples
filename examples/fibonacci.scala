object Fibonacci {
  def fib(n: Int) : Int = {
    if (n<=0) 0
    else if(n == 1) 1
    else fib(n-1) + fib(n-2)
  }
  def main(args: Array[String]) : Unit = {
    val n = 10
    for (i<-0 until n) {
      println(s"Fib($i) = ${fib(i)}")
    }
  }
}

/*
Output:

Fib(0) = 0
Fib(1) = 1
Fib(2) = 1
Fib(3) = 2
Fib(4) = 3
Fib(5) = 5
Fib(6) = 8
Fib(7) = 13
Fib(8) = 21
Fib(9) = 34
*/
