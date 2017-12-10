import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var sumador:Double=0.0
    var cantidad:Int=0
    var numero:Double
   for (i in 1..6){
        numero=leer.nextDouble()
        if (numero>0.toDouble()){
            sumador+=numero
            cantidad++
        }
    }
    sumador = sumador/cantidad.toDouble()
    println("$cantidad valores positivos")
    System.out.printf("%.1f\n",sumador)
}
