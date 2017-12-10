import java.util.*

fun main(args: Array<String>) {

	val leer = Scanner(System.`in`)
    val tiempo = leer.nextInt()
    val velocidad = leer.nextInt()
    val consumo = (tiempo * velocidad) / 12.0
    System.out.printf("%.3f\n", consumo)
	
}
