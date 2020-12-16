fun main() { 

	var int1 = 2
    var int2 = 5
    var int3 = 10
    fun max(a: Int, b: Int, c: Int):Int{
        if(a>b){
            if(a>c)
            return a
            else 
            return c
        }
        else{
            if(b>c)
            return b
            else
            return c
        }   
    }
    var result:Int =max(int1,int2,int3)
    println("max of $int1, $int2, $int3 is $result ")
    
}