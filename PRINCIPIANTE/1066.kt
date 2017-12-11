import java.util.Scanner

fun main(args: Array<String>) {

    val leer = Scanner(System.`in`)

    val a = leer.nextInt()
    val b = leer.nextInt()
    val c = leer.nextInt()
    val d = leer.nextInt()
    val e = leer.nextInt()

    var valoresPares = 0
    var valoresImpares = 0
    var valoresPositivos = 0
    var valoresNegativos = 0

    // Para los positivos:
    var g = 0
    var h = 0
    var i = 0
    var j = 0
    var k = 0

    // Para los negativos:
    var l = 0
    var m = 0
    var n = 0
    var o = 0
    var p = 0

    // Para los pares:
    var q = 0
    var r = 0
    var s = 0
    var t = 0
    var u = 0

    // Para los ímpares:
    var v = 0
    var w = 0
    var x = 0
    var y = 0
    var z = 0

    if (a > 0) g = 1
    if (a < 0) l = 1
    if (a % 2 == 0) q = 1
    if (a % 2 != 0) v = 1
    if (b > 0) h = 1
    if (b < 0) m = 1
    if (b % 2 == 0) r = 1
    if (b % 2 != 0) w = 1
    if (c > 0) i = 1
    if (c < 0) n = 1
    if (c % 2 == 0) s = 1
    if (c % 2 != 0) x = 1
    if (d > 0) j = 1
    if (d < 0) o = 1
    if (d % 2 == 0) t = 1
    if (d % 2 != 0) y = 1
    if (e > 0) k = 1
    if (e < 0) p = 1
    if (e % 2 == 0) u = 1
    if (e % 2 != 0) z = 1


    valoresPositivos = g + h + i + j + k
    valoresNegativos = l + m + n + o + p
    valoresPares = q + r + s + t + u
    valoresImpares = v + w + x + y + z

    println(valoresPares.toString() + " valor(es) par(es)")
    println(valoresImpares.toString() + " valor(es) impar(es)")
    println(valoresPositivos.toString() + " valor(es) positivo(s)")
    println(valoresNegativos.toString() + " valor(es) negativo(s)")

}
