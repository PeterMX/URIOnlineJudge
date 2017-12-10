import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val precios = floatArrayOf(4.00f,4.50f,5.00f,2.00f,1.50f)

    val codigo = leer.nextInt()
    val cantidad = leer.nextInt()

    System.out.printf("Total: R$ %.2f%n",(cantidad*precios[codigo-1]))
}
