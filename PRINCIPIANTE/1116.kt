import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    val n = leer.nextInt()
    var x = 0
    var y = 0
    var res = 0f
    var resultado: String

    for (c in 1..n) {

        x = leer.nextInt()
        y = leer.nextInt()

        if (y != 0) {

            res = x.toFloat() / y

            resultado = String.format("%.1f", res)

            println(resultado)

        } else {

            println("divisao impossivel")

        }
    }
}
