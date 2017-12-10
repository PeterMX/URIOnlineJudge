import java.util.*

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var t:Int=leer.nextInt()
    for(ti in 0..t-1){
        val n = leer.nextInt()
        val m = leer.nextInt()
        val a = IntArray(n)
        for (i in 0..n-1){
            a[i] = leer.nextInt()
        }
        println(minimo(a,n,m,m))
    }

}
fun minimo(x:IntArray,y:Int,z:Int,imp:Int):Int{
    //val dp=mutableMapOf<Int,Int>(0 to 0)
    val dp=IntArray(imp+1)
    dp[0]=0
    for(j in 1..z){
        dp[j] = Int.MAX_VALUE
    }
    var j:Int = 1
    while (j <= z){
        for (k in 0..y-1){
            if (x[k] <= j){
                val temp = dp[j-x[k]]
                if (temp != Int.MAX_VALUE && temp!!+1 < dp[j]!!){
                    dp[j]=1+ temp!!
                }
            }
        }
        j += 1
    }
    return dp[imp]!!
}
