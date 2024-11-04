// Function to check if a string is a Palindrome
object CheckPalindrome {
  def isPalindrome(s: String): Boolean = {
    val cleaned_text = s.toLowerCase.replaceAll("[^a-z0-9]","")
    cleaned_text == cleaned_text.reverse
  }
  def main(args: Array[String]): Unit = {
    val testStr = "A man, a plan, a canal Panama"
    println(s"Is the string $testStr palindrome? ${isPalindrome(testStr)}")
  }
}
/*
Output:
Is the string A man, a plan, a canal Panama palindrome? tru
*/
