fun main(args: Array<String>) {
  println("Enter a integer")
  val input = readLine()!!
  var integer:Int = input.toInt()
  if(integer > 0)
  println("$integer is positive")
  else
  println("$integer is negetive")
}