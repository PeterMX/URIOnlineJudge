import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    loop@ while (true) {

        val y = leer.nextInt()
        val x = leer.nextInt()

        when {
            y < x -> println("Crescente")
            y > x -> println("Decrescente")
            else -> break@loop
        }
    }
}
