// Lais M. T. Rangel

fun main() {
    var raio: Double
    var area: Double

    println("Insira o valor do raio da circunferência: ")
    raio = readln().toDouble()

    area = calcArea(raio)
    println("A área da circunferência é $area")
}

fun calcArea (raio: Double): Double {
    var res: Double

    res = 3.14 * (raio * raio)
    return res
}