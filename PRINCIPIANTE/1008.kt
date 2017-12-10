import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val empleado = leer.nextInt()
    val horas = leer.nextInt()
    val monto = leer.nextFloat()

    println("NUMBER = $empleado")
    System.out.printf("SALARY = U$ %.2f\n",(horas*monto))
}
