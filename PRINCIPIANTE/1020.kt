import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    var dias = leer.nextInt()

    println("${(dias/365)} ano(s)")
    dias -= (dias/365)*365
    println("${dias/30} mes(es)")
    dias -= (dias/30)*30
    println("$dias dia(s)")
}
