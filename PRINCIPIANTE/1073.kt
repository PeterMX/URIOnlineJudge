import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)
    val n = leer.nextInt()

    if (n > 5 && n < 2000) {
        for (c in 2..n step 2) {
            //println(c.toString() + "^2 = " + Math.pow(c.toDouble(), 2.0).toInt())
            println("$c^2 = ${Math.pow(c.toDouble(), 2.0).toInt()}")
        }
    }
}
