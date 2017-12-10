import java.text.DecimalFormat
import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    leer.next()
    val salario = leer.nextDouble()
    val ventas = leer.nextDouble()

    System.out.printf("TOTAL = R$ %.2f%n",(dosFormat(salario+(ventas*0.15))).toFloat())
    //println("TOTAL = R$ ${dosFormat(salario+(ventas*0.15))}")
}
fun dosFormat(num:Double):String{
    return DecimalFormat("#.##").format(num)
}
