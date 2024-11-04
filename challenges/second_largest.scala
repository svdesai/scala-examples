// Finding the second largest element in a list
object SecondLargest {
  def secondLargest(nums: List[Int]): Int = {
    val distinctEle = nums.distinct
    if (distinctEle.size < 2) throw new NoSuchFieldException("no such element in the list")
    distinctEle.sorted.apply(distinctEle.length - 2)
  }
  def main(args: Array[String]):  Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    val result = secondLargest(numbers)
    print(s"Second largest element: $result")
  }
}

/*
Output:
Second largest element: 4
*/
