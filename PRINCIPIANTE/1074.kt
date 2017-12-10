import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val repetir = leer.nextInt()

    for(i in 1..repetir){
        val numero = leer.nextInt()
        when {
            numero==0 -> println("NULL")
            numero%2==0 && numero>0 -> println("EVEN POSITIVE")
            numero>0 -> println("ODD POSITIVE")
            numero%2==0 && numero<0 -> println("EVEN NEGATIVE")
            numero<0 -> println("ODD NEGATIVE")
        }
    }
}
