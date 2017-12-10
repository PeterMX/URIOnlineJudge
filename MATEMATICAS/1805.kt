import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    while (leer.hasNextInt()){
        val a = leer.nextInt()
        val b = leer.nextLong()
        var suma:Long = 0
        suma = (a+b)*(b-a+1)/2
        println("$suma")
    }

}
