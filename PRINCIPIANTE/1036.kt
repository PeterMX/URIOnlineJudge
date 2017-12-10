import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val a = leer.nextDouble()
    val b = leer.nextDouble()
    val c = leer.nextDouble()
    if (a==0.0 || ((b*b)-(4.0*a*c)) < 0.0){
        println("Impossivel calcular")
    }else{
        val r1 = (-b + Math.sqrt(((b*b)-(4.0*a*c))))/(2.0*a)
        val r2 = (-b - Math.sqrt(((b*b)-(4.0*a*c))))/(2.0*a)

        System.out.printf("R1 = %.5f%n",r1)
        System.out.printf("R2 = %.5f%n",r2)

    }

}
