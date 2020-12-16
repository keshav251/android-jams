fun main() { 

	//var x = 5
    println("Enter a number:")
    val input = readLine()!!
    var k = input.toInt()
    
    fun findfact(a:Int): Unit {
    	var fact = 1    
        for(i in a downTo 1){
        	fact = fact*i
        }
        println("factorial of given number is $fact")
    }
 	 //findfact(x)
     findfact(k)
    
    
}