import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    val horaInicial = leer.nextInt()
    val horaFinal = leer.nextInt()

    var duracion = 0

    if (horaFinal > horaInicial) {
        duracion = horaFinal - horaInicial
    } else {
        duracion = Math.abs(horaFinal + 24 - horaInicial)
    }
    println("O JOGO DUROU $duracion HORA(S)")
}
