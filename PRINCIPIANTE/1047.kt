import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    val horaInicial = leer.nextInt()
    val minutoInicial = leer.nextInt()
    val horaFinal = leer.nextInt()
    val minutoFinal = leer.nextInt()

    var duracion = 0
    var dMinutos = 0

    when {
        horaFinal > horaInicial && minutoFinal > minutoInicial -> {
            duracion = horaFinal - horaInicial
            dMinutos = minutoFinal - minutoInicial
        }
        horaFinal > horaInicial && minutoFinal < minutoInicial -> {
            duracion = horaFinal - horaInicial - 1
            dMinutos = Math.abs(minutoFinal + 60 - minutoInicial)
        }
        horaFinal < horaInicial && minutoFinal > minutoInicial -> {
            duracion = Math.abs(horaFinal + 24 - horaInicial)
            dMinutos = minutoFinal - minutoInicial
        }
        horaFinal < horaInicial && minutoFinal < minutoInicial -> {
            duracion = Math.abs(horaFinal + 24 - horaInicial -1)
            dMinutos = Math.abs(minutoFinal + 60 - minutoInicial)
        }
        else -> {
            duracion = Math.abs(horaFinal + 24 - horaInicial)
            dMinutos = Math.abs(minutoFinal - minutoInicial)
        }
    }
    println("O JOGO DUROU $duracion HORA(S) E $dMinutos MINUTO(S)")
}
