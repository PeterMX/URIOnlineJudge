import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val A = BooleanArray(5)
    val B = BooleanArray(5)
    var aux:Byte
    var imprimir = "Y"
    for (i in 0..4){
        aux = leer.nextByte()
        if (aux==1.toByte()) A[i]=true
        else A[i]=false
    }
    for (i in 0..4){
        aux = leer.nextByte()
        if (aux==1.toByte()) B[i]=true
        else B[i]=false
    }
    for (i in 0..4){
        if (A[i]==B[i]){
            imprimir = "N"
            break
        }
    }
    println("$imprimir")
}
