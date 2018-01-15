import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    var senha = 0

    do {

        senha = leer.nextInt()

        if (senha != 2002) {

            println("Senha Invalida")

        } else {

            println("Acesso Permitido")

        }
    } while (senha != 2002)

}
