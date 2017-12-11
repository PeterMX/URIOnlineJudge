import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    val a = leer.nextFloat().toDouble()
    val b = leer.nextFloat().toDouble()
    val c = leer.nextFloat().toDouble()

    val qa = Math.pow(a, 2.0)
    val qb = Math.pow(b, 2.0)
    val qc = Math.pow(c, 2.0)

    if (a >= b + c || b >= a + c || c >= a + b) {
        println("NAO FORMA TRIANGULO")
    } else {
        if (qa == qb + qc || qb == qa + qc || qc == qa + qb) {
            println("TRIANGULO RETANGULO")
        } else {
            if (qa > qb + qc || qb > qa + qc || qc > qa + qb) {
                println("TRIANGULO OBTUSANGULO")
            } else if (qa < qb + qc || qb < qa + qc || qc < qa + qb) {
                println("TRIANGULO ACUTANGULO")
            }
        }
        if (a == b && b == c || a == c && c == b || b == c && c == a) {
            println("TRIANGULO EQUILATERO")
        } else if (a == b && b != c || a == c && c != b || b == c && c != a) {
            println("TRIANGULO ISOSCELES")
        }
    }
}
