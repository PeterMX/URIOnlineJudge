import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    val entradas = leer.nextInt()
    var index=0
    val arreglo1=IntArray(entradas)
    val arreglo2=IntArray(entradas)
    for (i in 1..entradas){
        arreglo1[i-1]=leer.nextInt()
    }
    arreglo1.sort()
    for (i in 0..entradas-1){
        if (i==0){
            arreglo2[0]=1

        }else if (arreglo1[i]==arreglo1[i-1]){
            arreglo2[index] += 1
        }else{
            index=i
            arreglo2[index] += 1
        }
    }
    for (i in 0..entradas-1){
        if (arreglo2[i] != 0){
            println("${arreglo1[i]} aparece ${arreglo2[i]} vez(es)")
        }
    }

}
