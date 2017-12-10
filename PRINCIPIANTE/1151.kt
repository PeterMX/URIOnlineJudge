import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val numero:Byte=leer.nextByte()
    println(fibonacci(0,1,(numero-1).toByte(),"0"))
}
tailrec private fun fibonacci(a:Long , b: Long, n: Byte,cadena:String): String {
    return if (n == 0.toByte()) cadena else fibonacci(b, a + b, (n - 1).toByte(),"$cadena $b")
}
