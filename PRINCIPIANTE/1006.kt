import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val a:Float = leer.nextFloat()
    val b:Float = leer.nextFloat()
    val c:Float = leer.nextFloat()

    System.out.printf("MEDIA = %.1f",(a*0.2+b*0.3+c*0.5))
    println()
}
