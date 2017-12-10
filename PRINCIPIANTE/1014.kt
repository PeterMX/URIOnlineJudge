import java.text.DecimalFormat
import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val a = leer.nextInt()
    val b = leer.nextFloat()

    System.out.printf("%.3f km/l%n",dosFormat(a/b*1.0).toFloat())
}
private fun dosFormat(num:Double):String{
    return DecimalFormat("#.###").format(num)
}
