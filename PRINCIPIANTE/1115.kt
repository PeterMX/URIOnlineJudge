import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    var x = 1
    var y = 1

    do {

        x = leer.nextInt()
        y = leer.nextInt()

        when {
            x > 0 && y > 0 -> println("primeiro")
            x > 0 && y < 0 -> println("quarto")
            x < 0 && y < 0 -> println("terceiro")
            x < 0 && y > 0 -> println("segundo")
        }
    } while (x != 0 && y != 0)
}
