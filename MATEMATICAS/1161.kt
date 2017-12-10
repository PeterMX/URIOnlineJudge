import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var A:Int
    var B:Int
    while (leer.hasNextInt()){
        A = leer.nextInt()
        B = leer.nextInt()

        println(factorial(A)+factorial(B))
    }
}
private fun factorial(numero:Int): Long{
    if (numero == 0) return 1
    else if (numero == 1) return 1
    else return numero*factorial(numero-1)
}
