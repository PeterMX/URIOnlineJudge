import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var imp = 0
    for (i in 1..6) if (leer.nextFloat() > 0) imp++
    println("$imp valores positivos")
}
