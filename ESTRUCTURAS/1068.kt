import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    //var repetir = true
    while (leer.hasNext()){
        var termino:Boolean = true
        val funcion:String = leer.next()
        if (funcion != null && funcion.length > 0){
            var parentecisIsquierdo:Int = 0
            var parentecisDerecho:Int = 0
            for (letra in funcion){
                if (letra == ')' && parentecisIsquierdo == 0){
                    println("incorrect")
                    termino = false
                    break
                }
                else if (letra == '('){
                    parentecisIsquierdo += 1
                }else if (letra == ')'){
                    if (parentecisIsquierdo<=parentecisDerecho){
                        println("incorrect")
                        termino = false
                        break
                    }else{
                        parentecisDerecho += 1
                    }
                }
            }
            if (termino){
                if (parentecisDerecho == parentecisIsquierdo) println("correct")
                else println("incorrect")
            }

        }

    }
}
