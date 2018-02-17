import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val palabras = leer.nextInt()

    for(i in 1..palabras){
        val palabra = leer.next()
        when{
            palabra.length == 5 -> println('3')

            palabra[0]=='o' && palabra[1]=='n' -> println('1')
            palabra[0]=='o' && palabra[2]=='e' -> println('1')
            palabra[1]=='n' && palabra[2]=='e' -> println('1')

            palabra[0]=='t' && palabra[1]=='w' -> println('2')
            palabra[0]=='t' && palabra[2]=='o' -> println('2')
            palabra[1]=='w' && palabra[2]=='o' -> println('2')
        }
    }
}
