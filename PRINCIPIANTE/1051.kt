import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)
    val salario = leer.nextDouble()

    when {
        salario >= 0.00 && salario <= 2000.00 -> println("Isento")
        salario >= 2000.01 && salario <= 3000.00 -> {
            val imp = 0.08 * (salario - 2000.00)
            val imposto = String.format("%.2f", imp)
            println("R$ $imposto")
        }
        salario >= 3000.01 && salario <= 4500.00 -> {
            val imp = (salario - 3000.00) * 0.18 + 0.08 * (salario - 2000 - (salario - 3000))
            val imposto = String.format("%.2f", imp)
            println("R$ $imposto")
        }
        salario > 4500.00 -> {
            val imp = (salario - 4500.00) * 0.28 + 0.18 * (salario - 3000.00 - (salario - 4500.00)) + 0.08 * (salario - 3500.00 - (salario - 4500.00))
            val imposto = String.format("%.2f", imp)
            println("R$ $imposto")
        }
    }
}
