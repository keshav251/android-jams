fun main() { 

	//var x = 3
    println("Enter a number:")
    val input = readLine()!!
    var k = input.toInt()
    
    fun SumOfFactorial(a:Int): Unit {
    	var fact:Int    
        var sum = 0
        for(i in 1..a){
            fact = 1
            for(j in i downTo 1)
        		fact *= j
        	sum += fact
        }
        
        println("factorial sum of given number is $sum")
    }
 	 //findfact(x)
    SumOfFactorial(k)
    
    
}