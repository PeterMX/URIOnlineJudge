import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)
    val n = leer.nextInt()

    for (c in 1..10000) {
        if (c % n == 2) println(c)
    }
    
}
