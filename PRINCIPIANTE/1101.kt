import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    while (true){
        val inicio = leer.nextInt()
        val fin = leer.nextInt()
        if (inicio<=0 || fin<=0) break
        var cadena = ""
        var sumar = 0
        if (inicio<fin)
        {
            for (i in inicio..fin){
                cadena+="$i "
                sumar+=i
            }
        }else{
            for (i in fin..inicio){
                cadena+="$i "
                sumar+=i
            }
        }
        println("${cadena}Sum=$sumar")
    }
}
