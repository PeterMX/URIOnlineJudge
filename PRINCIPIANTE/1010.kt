import java.text.DecimalFormat
import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    leer.nextInt()
    val cantidad = leer.nextInt()
    val precio = leer.nextDouble()
    leer.nextInt()
    val cantidad2 = leer.nextInt()
    val precio2 = leer.nextDouble()

    System.out.printf("VALOR A PAGAR: R$ %.2f%n",(dosFormat(cantidad*precio+cantidad2*precio2)).toFloat())
    //println("TOTAL = R$ ${dosFormat(salario+(ventas*0.15))}")
}
private fun dosFormat(num:Double):String{
    return DecimalFormat("#.##").format(num)
}
