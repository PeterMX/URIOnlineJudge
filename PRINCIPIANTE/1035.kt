import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val A = leer.nextInt()
    val B = leer.nextInt()
    val C = leer.nextInt()
    val D = leer.nextInt()

    var imprimir = "Valores nao aceitos"

    if(B>C && D>A && C+D > A+B && C>0 && D>0 && A%2 == 0) imprimir = "Valores aceitos"
    println(imprimir)
}
