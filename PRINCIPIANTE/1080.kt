import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    val valores = IntArray(100)

    var mayor = 0
    var menor = 0
    var posicion = 0

    for (c in 0..99)
    {
        valores[c] = leer.nextInt()
        if (c != 0)
        {
            if (valores[c] > mayor)
            {
                mayor = valores[c]
                posicion = c
            }
            if (valores[c] < menor) menor = valores[c]
        }
        else
        {
            mayor = valores[0]
            menor = valores[0]
        }
    }

    println(mayor)
    println(posicion + 1)

}
