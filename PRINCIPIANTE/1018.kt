import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val billetes = intArrayOf(100, 50, 20, 10, 5, 2, 1)
    var dinero = leer.nextInt()
    println(dinero)
    for(billete in billetes){
        println("${dinero/billete} nota(s) de R\$ $billete,00")
        dinero -= ((dinero/billete)*billete)
    }
}
