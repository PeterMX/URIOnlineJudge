import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var jugadas = 0
    var MaryWon: MutableList<Boolean> = mutableListOf()
    var JohnWon: MutableList<Boolean> = mutableListOf()
    var repetir = true
    while (repetir){
        jugadas = leer.nextInt()
        if (jugadas==0){
            repetir = false
            break
        }
        for (i in 1..jugadas){
            val aux = leer.nextInt()
            if (aux==0) MaryWon.add(true)
            else if (aux==1) JohnWon.add(true)
        }
        println("Mary won ${MaryWon.size} times and John won ${JohnWon.size} times")
        MaryWon = mutableListOf()
        JohnWon = mutableListOf()
    }
}
