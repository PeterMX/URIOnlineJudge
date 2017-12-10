import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var repetir = true
    var L: Byte
    var R: Byte
    val cero: Byte = 0
    while (repetir){
        L=leer.nextByte()
        R=leer.nextByte()
        if (L==cero && R==cero){
            repetir=false
            break
        }else println(L+R)
    }
}
