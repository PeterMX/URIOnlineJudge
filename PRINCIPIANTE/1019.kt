import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    var segundos = leer.nextInt()

    print("${(segundos/60)/60}:")
    segundos -= ((segundos/60)/60)*3600
    print("${(segundos/60)}:")
    segundos -= (segundos/60)*60
    println("$segundos")
}
