fun main() { 
	//var x = 1234
  println("Enter a number:")
  val input = readLine()!!
  var x = input.toInt()
  fun GetDigit(a:Int): Int{
    var n = a
    var d = 0
    while(n != 0){
        n /= 10
        d++
    }
    return d
  }
  fun ChkArmstrong(a:Int): Unit {
    var d:Int    
    var sum = 0 
    var n = a
    while(n != 0){
        d = n%10
        n /= 10
        sum += Math.pow(d.toDouble(),GetDigit(a).toDouble()).toInt()
    }
    if (sum.toInt() == x)
      println("Entered three digit number is an Armstrong")
    else
    	println("Entered three digit number is not an Armstrong") 
  }
 	ChkArmstrong(x)
    
}