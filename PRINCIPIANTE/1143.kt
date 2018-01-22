import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    val n = leer.nextInt()

    for (c in 1..n) {
        println("$c ${Math.pow(c.toDouble(), 2.0).toInt()} ${Math.pow(c.toDouble(),3.0).toInt()}")
    }
}
