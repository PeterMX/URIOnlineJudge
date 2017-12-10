import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val consumidos = leer.nextInt()
    val partisipantes = leer.nextInt()

    System.out.printf("%.2f%n",(consumidos/(partisipantes*1.0)))
}
