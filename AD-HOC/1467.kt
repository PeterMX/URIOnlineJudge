import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var ceoyuno:String?
    var arreglo=IntArray(3)
    while (leer.hasNextInt()){
        arreglo[0]=leer.nextInt()
        arreglo[1]=leer.nextInt()
        arreglo[2]=leer.nextInt()
        if (arreglo[0]==arreglo[1]&&arreglo[1]==arreglo[2]) println("*")
        else if (arreglo[0]==arreglo[1]&&arreglo[1]!=arreglo[2]) println("C")
        else if (arreglo[0]==arreglo[2]&&arreglo[2]!=arreglo[1]) println("B")
        else if (arreglo[1]==arreglo[2]&&arreglo[2]!=arreglo[0]) println("A")
    }
}
