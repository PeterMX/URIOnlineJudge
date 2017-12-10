import java.util.Scanner
fun main(args: Array<String>) {
    val leer=Scanner(System.`in`)
    val repetir=leer.nextInt()
    var años:Int
    val siglo:String="Mais de 1 seculo."
    for (i in 1..repetir){
        años=0
        var A=leer.nextInt()
        var B=leer.nextInt()
        val growA=leer.nextDouble()
        val growB=leer.nextDouble()
        while (A<=B){
            años++
            A=A+(A*(growA/100)).toInt()
            B=B+(B*(growB/100)).toInt()
            if (años>100){
                break
            }
        }
        if (años<=100) println("$años anos.")
        else println(siglo)
    }
}
