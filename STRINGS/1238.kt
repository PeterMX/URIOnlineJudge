import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val casos = leer.nextInt()
    for (i in 1..casos){
        val cadena1:String = leer.next()
        val cadena2:String = leer.next()
        var cadena3:String = ""
        if (cadena1.length > cadena2.length){
            for (il in 0..cadena2.length-1){
                cadena3 += "${cadena1[il]}${cadena2[il]}"
            }
            for (il in cadena2.length..cadena1.length-1){
                cadena3+="${cadena1[il]}"
            }
        }else{
            for (il in 0..cadena1.length-1){
                cadena3 += "${cadena1[il]}${cadena2[il]}"
            }
            for (il in cadena1.length..cadena2.length-1){
                cadena3+="${cadena2[il]}"
            }
        }
        println(cadena3)
    }
}
