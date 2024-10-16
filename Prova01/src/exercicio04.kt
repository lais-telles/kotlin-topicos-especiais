// Lais M. T. Rangel

fun main() {
    var grausF: Float

    println("Insira os graus (em Fahrenheit)")
    grausF = readln().toFloat()

    println("Graus em Celsius: " + celsius(grausF))
}

fun celsius (grau: Float): Double {
    var res: Double

    res = (grau-32) / 1.8
    return res
}