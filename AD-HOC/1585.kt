import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val casos = leer.nextInt()
    for (x in 1..casos){
        val x = leer.nextInt()
        val y = leer.nextInt()
        println("${(x*y)/2} cm2")
    }
}
