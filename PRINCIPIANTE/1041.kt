import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var imprimir=""
    val x:Float = leer.nextFloat()
    val y:Float = leer.nextFloat()

    if (x==0F && y==0F) imprimir = "Origem"
    else if (x==0F) imprimir = "Eixo Y"
    else if (y==0F) imprimir = "Eixo X"
    else if (x>0F && y>0F) imprimir = "Q1"
    else if (x<0F && y>0F) imprimir = "Q2"
    else if (x<0F && y<0F) imprimir = "Q3"
    else if (x>0f && y<0F) imprimir = "Q4"

    println(imprimir)
}
