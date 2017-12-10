import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val meses = arrayOf("", "January","February","March","April","May","June",
            "July","August","September","October","November","December")
    val mes = leer.nextInt()
    println("${meses[mes]}")
}
