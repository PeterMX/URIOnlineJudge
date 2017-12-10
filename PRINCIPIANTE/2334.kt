import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    while (true){
        val numeropatos = leer.nextBigInteger()
        if (numeropatos< BigInteger.ZERO)break
        else if (numeropatos!= BigInteger.ZERO)println("${numeropatos- BigInteger.ONE}")
        else println("0")

    }
}
