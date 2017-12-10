import java.text.DecimalFormat
import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val x1 = leer.nextFloat()
    val y1 = leer.nextFloat()
    val x2 = leer.nextFloat()
    val y2 = leer.nextFloat()

    System.out.printf("%.4f%n",dosFormat(
            Math.sqrt(
                Math.pow((x2-x1).toDouble(),2.0)+
                Math.pow((y2-y1).toDouble(),2.0)
            )
    ).toFloat())
}
private fun dosFormat(num:Double):String{
    return DecimalFormat("#.####").format(num)
}
