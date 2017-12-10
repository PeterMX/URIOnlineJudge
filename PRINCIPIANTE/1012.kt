import java.text.DecimalFormat
import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val a = leer.nextFloat()
    val b = leer.nextFloat()
    val c = leer.nextFloat()

    System.out.printf("TRIANGULO: %.3f%n",dosFormat((a*c)/2.0).toFloat())
    System.out.printf("CIRCULO: %.3f%n",dosFormat((3.14159*Math.pow(c.toDouble(),2.0))).toFloat())
    System.out.printf("TRAPEZIO: %.3f%n",dosFormat(c*((a+b)/2.0)).toFloat())
    System.out.printf("QUADRADO: %.3f%n",dosFormat((b*b*1.0)).toFloat())
    System.out.printf("RETANGULO: %.3f%n",dosFormat(a*b*1.0).toFloat())
}
private fun dosFormat(num:Double):String{
    return DecimalFormat("#.###").format(num)
}
