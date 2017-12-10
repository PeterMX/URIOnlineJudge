import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val a:Int = leer.nextInt()
    val b:Int = leer.nextInt()
    val c:Int = leer.nextInt()

    println("${(((a+b+Math.abs(a-b))/2)+c+Math.abs(((a+b+Math.abs(a-b))/2)-c))/2} eh o maior")
}
