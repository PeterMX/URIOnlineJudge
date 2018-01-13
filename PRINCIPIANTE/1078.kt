import java.util.Scanner

fun main(args: Array<String>)
{

    val leer = Scanner(System.`in`)
    val N = leer.nextInt()

    if (N > 2 && N < 1000)
    {
        for (c in 1..10) println("$c x $N = ${N*c}")
    }

}
