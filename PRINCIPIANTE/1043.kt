import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val a = leer.nextFloat()
    val b = leer.nextFloat()
    val c = leer.nextFloat()

    if (a >= b + c || b >= a + c || c >= a + b) {
        val areaDelTrapezio = (a + b) * c / 2
        val area = String.format("%.1f", areaDelTrapezio)
        println("Area = " + area)
    } else {
        val perimetroDelTriangulo = a + b + c
        val perimetro = String.format("%.1f", perimetroDelTriangulo)
        println("Perimetro = " + perimetro)
    }
}
