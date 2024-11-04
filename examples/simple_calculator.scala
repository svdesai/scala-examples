object SimpleCalc {
  def calculate(op: String, a: Double, b: Double): Double = op match {
    case "+" => a + b
    case "-" => a - b
    case "*" => a * b
    case "/" => if (b != 0) a/b else throw new IllegalArgumentException("Cannot divide by 0")
    case _ => throw new IllegalArgumentException("Invalid operation")
     
  } 
  def main(args: Array[String]): Unit = {
    var ops = List("+", "-", "*", "/", "abc")
    var a = 2
    var b = 3
    ops.foreach(op => {
      var result = calculate(op, a, b)
      println(s"$a $op $b = $result")
    })
  }
}

/*
Output:

2 + 3 = 5.0
2 - 3 = -1.0
2 * 3 = 6.0
2 / 3 = 0.6666666666666666

java.lang.IllegalArgumentException: Invalid operation
	at Main$.calculate(HelloWorld.scala:7)
*/
