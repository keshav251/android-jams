fun main() { 

	var int1 = 2
    var int2 = 55
    
    fun check(a:Int){
        if(a%5 == 0 && a%11 == 0)
        println("divisible by 5 and 11")
        else
        println("not divisible by 5 and 11")
    }
    check(int1)
    check(int2)
}