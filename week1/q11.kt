fun main() { 

	//var x = 153
    println("Enter a three digit number:")
    val input = readLine()!!
    var x = input.toInt()
    
    fun ChkArmstrong(a:Int): Unit {
    	var d:Int    
      var sum = 0 
      var n = a
      while(n != 0){
        d = n%10
        n /= 10
        sum += d*d*d 
      }
      if (sum == x)
        println("Entered three digit number is an Armstrong")
      else
    	  println("Entered three digit number is not an Armstrong") 
    }
 	  ChkArmstrong(x)
    
    
}