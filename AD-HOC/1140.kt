import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var repetir = true
    while (repetir){
        val frace = leer.nextLine().toUpperCase().split(" ")
        if (frace[0]!="*"){
            val primeraletra = frace[0][0]
            var imprimir = true
            for (palabra in frace){
                if (primeraletra!=palabra[0]){
                    println("N")
                    imprimir = false
                    break
                }
            }
            if (imprimir) println("Y")
        }else{
            repetir = false
        }
    }
}
