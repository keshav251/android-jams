import java.util.Scanner
fun main() { 

	  var x = 'a'
    var y = '2'
    var z = '*'
    val scanner = Scanner(System.`in`)
    println("Enter a character:")
    var ch = scanner.next().single()
    fun check(a:Char){
        if(a in 'a'..'z' || a in 'A'..'Z')
        println("Given character is an alphabet")
        else
        println("Given character is not an alphabet")
    }
    //check(x)
    //check(y)
    //check(z)
    check(ch)
}