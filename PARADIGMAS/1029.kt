import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var x:Int
    val casos = leer.nextInt()
    for (i in 1..casos) {
        x = leer.nextInt()
        println("fib($x) = ${fibonacciN(x)-1} calls = ${fibonacci(x)}")
    }
}
fun fibonacciN(n:Int):Long{
    if (n == 0) return 1
    else if (n == 1) return 1
    else return fibonacciN(n-1)+fibonacciN(n-2)+1
}
fun fibonacci(n:Int):Long{
    if (n == 0) return 0
    else if (n == 1) return 1
    else return fibonacci(n-1)+fibonacci(n-2)
}
