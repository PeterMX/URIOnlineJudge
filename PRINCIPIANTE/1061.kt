import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)

    val dia1 = leer.nextLine().replace("\n","")
    val hora1 = leer.nextLine()
    val dia2 = leer.nextLine().replace("\n","")
    val hora2 = leer.nextLine()
    val intDia1:Int
    val intDia2:Int

    if (dia1[dia1.length-2].equals(' ')){
        intDia1 = dia1[dia1.length-1].toString().toInt()
    }else{
        intDia1 = "${dia1[dia1.length-2]}${dia1[dia1.length-1]}".toInt()
    }
    if (dia2[dia2.length-2].equals(' ')){
        intDia2 = dia2[dia2.length-1].toString().toInt()
    }else{
        intDia2 = "${dia2[dia2.length-2]}${dia2[dia2.length-1]}".toInt()
    }

    val hora1A = hora1.split(" : ").map { it.toInt() }.toIntArray()
    val hora2A = hora2.split(" : ").map { it.toInt() }.toIntArray()

    var NDia = intDia2 - intDia1
    var NHora:Int
    var NMinuto:Int
    val NSegundo:Int

    if (hora1A[0]>hora2A[0]){
        NDia--
        NHora = (24)-(hora1A[0]-hora2A[0])
    }else{
        NHora = (hora2A[0]-hora1A[0])
    }

    if (hora1A[1]>hora2A[1]){
        NHora--
        NMinuto = (60)-(hora1A[1]-hora2A[1])
    }else{
        NMinuto = (hora2A[1]-hora1A[1])
    }

    if (hora1A[2]>hora2A[2]){
        NMinuto--
        NSegundo = (60)-(hora1A[2]-hora2A[2])
    }else{
        NSegundo = (hora2A[2]-hora1A[2])
    }

    println("$NDia dia(s)")
    println("$NHora hora(s)")
    println("$NMinuto minuto(s)")
    println("$NSegundo segundo(s)")

}
