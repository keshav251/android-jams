fun main(args: Array<String>) {
  println("Enter a three sides :")
  val input1 = readLine()!!
  val input2 = readLine()!!
  val input3 = readLine()!!
  var side1:Int = input1.toInt()
  var side2:Int = input2.toInt()
  var side3:Int = input3.toInt()
  if(side1 == side2 && side2 == side3)
  println("Equilateral Triangle")
  else if(side1 == side2 || side2 == side3 || side1 == side3)
  println("Isoceles Triangle")
  else
  println("Scalene Triangle")
}