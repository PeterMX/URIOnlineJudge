import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    val n = leer.nextInt()
    var x = 1

    for (c in 1..n) {
        println("$x ${x+1} ${x+2} PUM")
        x += 4
    }
}
