import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    val sal = leer.nextDouble()

    if (sal >= 0 && sal <= 400.00) {

        val percentualDeReajuste = 0.15
        val reajuste = "15 %"
        val novoSal = sal + sal * percentualDeReajuste
        val reajGanho = novoSal - sal

        val novoSalario = String.format("%.2f", novoSal)
        val reajusteGanho = String.format("%.2f", reajGanho)

        println("Novo salario: " + novoSalario)
        println("Reajuste ganho: " + reajusteGanho)
        println("Em percentual: " + reajuste)

    } else if (sal >= 400.01 && sal <= 800.00) {

        val percentualDeReajuste = 0.12
        val reajuste = "12 %"
        val novoSal = sal + sal * percentualDeReajuste
        val reajGanho = novoSal - sal

        val novoSalario = String.format("%.2f", novoSal)
        val reajusteGanho = String.format("%.2f", reajGanho)

        println("Novo salario: " + novoSalario)
        println("Reajuste ganho: " + reajusteGanho)
        println("Em percentual: " + reajuste)

    } else if (sal >= 800.01 && sal <= 1200.00) {

        val percentualDeReajuste = 0.1
        val reajuste = "10 %"
        val novoSal = sal + sal * percentualDeReajuste
        val reajGanho = novoSal - sal

        val novoSalario = String.format("%.2f", novoSal)
        val reajusteGanho = String.format("%.2f", reajGanho)

        println("Novo salario: " + novoSalario)
        println("Reajuste ganho: " + reajusteGanho)
        println("Em percentual: " + reajuste)

    } else if (sal >= 1200.01 && sal <= 2000.00) {

        val percentualDeReajuste = 0.07
        val reajuste = "7 %"
        val novoSal = sal + sal * percentualDeReajuste
        val reajGanho = novoSal - sal

        val novoSalario = String.format("%.2f", novoSal)
        val reajusteGanho = String.format("%.2f", reajGanho)

        println("Novo salario: " + novoSalario)
        println("Reajuste ganho: " + reajusteGanho)
        println("Em percentual: " + reajuste)

    } else if (sal > 2000.00) {

        val percentualDeReajuste = 0.04
        val reajuste = "4 %"
        val novoSal = sal + sal * percentualDeReajuste
        val reajGanho = novoSal - sal

        val novoSalario = String.format("%.2f", novoSal)
        val reajusteGanho = String.format("%.2f", reajGanho)

        println("Novo salario: " + novoSalario)
        println("Reajuste ganho: " + reajusteGanho)
        println("Em percentual: " + reajuste)

    }
}
