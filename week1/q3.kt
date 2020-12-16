import kotlin.math.abs
fun main() { 

	var int1 = 2
    var int2 = -5
    fun absolute(a: Int) = if(a>0) a else (-a)
       
    var result:Int =abs(int1)
    //or
    //var result:Int = absolute(int1)
    println("absolute value of given argument is $result ")
    result =abs(int2)
    //or
    //result =absolute(int2)
    println("absolute value of given argument is $result ")
}