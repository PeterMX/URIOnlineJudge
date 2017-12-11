import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val valor = leer.nextFloat()
    when {
        valor >= 0 && valor <= 25 -> println("Intervalo [0,25]")
        valor > 25 && valor <= 50 -> println("Intervalo (25,50]")
        valor > 50 && valor <= 75 -> println("Intervalo (50,75]")
        valor > 75 && valor <= 100 -> println("Intervalo (75,100]")
        else -> println("Fora de intervalo")
    }
}
