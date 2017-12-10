import java.util.Scanner
fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)
    val repetir=leer.nextInt()
    leer.nextLine()
    for (x in 1..repetir) {
        var aux = ""
        val mensaje:String = leer.nextLine().toUpperCase()
        val menlon: Int = mensaje.length
        for (letra in (menlon/2)-1 downTo 0) {
            aux += "${mensaje.toCharArray()[letra]}"
        }
        for (letra in menlon downTo (menlon / 2)+1){
            aux+="${mensaje.toCharArray()[letra-1]}"
        }
        println(aux)

    }


}
