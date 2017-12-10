import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val casos = leer.nextInt()
    var diamantess:String
    var izquierda:Int
    var derecha:Int
    var diamantes:Int
    for (i in 1..casos){
        diamantess = leer.next()
        izquierda = 0
        derecha = 0
        diamantes = 0
        for (letra in diamantess){
            if (letra == '<'){
                izquierda += 1
            }
            else if (letra == '>'){
                if(izquierda>derecha) {
                    diamantes++
                    izquierda--
                }
                else if (izquierda>0){
                    derecha++
                }
            }
        }
        println(diamantes)
    }
}
