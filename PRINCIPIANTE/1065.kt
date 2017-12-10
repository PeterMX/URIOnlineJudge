import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var imp = 0
    for (i in 1..5) if (leer.nextInt()%2==0) imp++
    println("$imp valores pares")
}
