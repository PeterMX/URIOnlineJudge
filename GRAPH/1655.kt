import java.util.Scanner

fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    while (true){
        val n = leer.nextInt()
        if (n==0) break
        var m = leer.nextInt()
        val dp = Array(n) { DoubleArray(n) }
        for (i in 0 until n){
            for (j in 0 until n){
                dp[i][j]=0.0
            }
        }
        while (m !== 0) {
            val x: Int
            val y: Int
            val v: Int
            x = leer.nextInt()
            y = leer.nextInt()
            v = leer.nextInt()
            dp[x - 1][y - 1] = v / 100.0
            dp[y - 1][x - 1] = v / 100.0
            m--
        }
        val ans = Array(n) { DoubleArray(n) }
        for (i in 0 until n){
            for (j in 0 until n){
                ans[i][j] = dp[i][j]
            }
        }
        for (k in 0 until n) {
            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (i == j || i == k || j == k) continue
                    if (ans[i][k] * ans[k][j] > ans[i][j]) {
                        ans[i][j] = ans[i][k] * ans[k][j]
                    }
                }
            }
        }
        System.out.printf("%.6f percent%n",ans[0][n-1]*100.0)
    }
    leer.close()
}
