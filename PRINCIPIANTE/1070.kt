import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val inicio = leer.nextInt()
    if(inicio%2==0) for (numero in inicio+1..(inicio+11) step 2) println(numero)
    else for (numero in inicio..inicio+11 step 2) println(numero)
}
