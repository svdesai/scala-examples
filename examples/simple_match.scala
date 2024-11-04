object SimpleMatch {
  def describe(x: Any): String = x match {
    case 0 => "zero"
    case n: Int if n < 0 => "negative"
    case n: Int if n > 0 => "positive"
    case _ => "not a number"
  }
  def main(args: Array[String]): Unit = {
    val numbers = List(-2, -1, 0, 1, 2, "abc")
    numbers.foreach(num => println(s"$num: ${describe(num)}"))
  }
}

/*
Output:

-2: negative
-1: negative
0: zero
1: positive
2: positive
abc: not a number
*/
