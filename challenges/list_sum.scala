// Sum of elements in the list
object ListSum {
  def sumOfList(arr: List[Int]): Int = {
      arr.foldLeft(0)((running_sum, current) => running_sum + current)  
  }
  
  def main(args: Array[String]): Unit = {
    var nums = List(1, 2, 3, 4, 5)
    val sum = sumOfList(nums)
    println(s"sum of elements in the list is $sum ")
  }
}
/*
Output:
sum of elements in the list is 15 
*/
