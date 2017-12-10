import java.util.*

fun main(args: Array<String>) {
    var num = 1
    val leer = Scanner(System.`in`)
    var x1=0
    var x2=0
    var y1=0
    var y2=0

    while (num==1){
        x1 = leer.nextInt()
        y1 = leer.nextInt()
        x2 = leer.nextInt()
        y2 = leer.nextInt()

        if (x1==0&&x2==0&&y1==0&&y2==0){
            num=0
            break
        }
        else{
            if(x1==x2&&y1==y2) println("0")
            else if (Math.abs(x1-x2)==Math.abs(y1-y2)||x1==x2||y1==y2) println("1")
            else println("2")
        }
    }
}
