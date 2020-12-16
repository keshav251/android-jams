fun main() { 

	  println("Enter a number:")
    val input = readLine()!!
    var x = input.toInt()
    
    fun SumOfEven(a:Int): Unit {
        var sum = 0
        for(i in 0..a step 2){
            sum += i
        }
        
        println("sum of all even numbers upto $a is $sum")
    }
 	 
    SumOfEven(x)
    
    
}