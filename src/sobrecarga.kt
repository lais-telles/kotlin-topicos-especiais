fun main() {
    var resultadoInt = calcular(10, 20)
    println("Soma $resultadoInt")

    var resultadoInt3 = calcular(10, 20, 30)
    println("Soma $resultadoInt3")

    var resultadoFloat = calcular(5.5f, 7.5f)
    println("Soma $resultadoFloat")
}

fun calcular (a: Int, b: Int): Int {
    return a + b
}

fun calcular (a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun calcular (a: Float, b: Float): Float {
    return a + b
}