fun main() { 

	//var x = 10
    println("Enter a number:")
    val input = readLine()!!
    var x = input.toInt()
    
    fun PrintHalfPyramid(a:Int): Unit {
    	  for(i in 1..a){
            for(j in 1..i)
            	print("#")
            println("")
        }
        
     }
 	  PrintHalfPyramid(x)
    
    
}