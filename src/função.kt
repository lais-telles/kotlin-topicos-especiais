fun main() {
    var valor1: Float
    var valor2: Float
    var soma: Float

    println("Entre com valor : ")
    valor1 = readln().toFloat()

    println("Entre com valor 2: ")
    valor2 = readln().toFloat()

    soma = somar(valor1, valor2)
    println("O valor da soma é $soma")
}

fun somar(valor1: Float, valor2: Float): Float {
    var soma: Float

    soma = valor1 + valor2

    return soma
}