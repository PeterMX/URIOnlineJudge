import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val limite = leer.nextInt()
    for (numero in 1..limite step 2) println(numero)
}
