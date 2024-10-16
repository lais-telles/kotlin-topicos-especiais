// Lais M. T. Rangel

fun main() {
    var litro: Int
    var valor: Double
    var tipoComb: Char
    var aux: String

    println("Entre com o tipo do combustivel (A ou G)")
    aux = readln()
    tipoComb = aux[0]

    println("Entre com a quantidade de litros")
    litro = readln().toInt()

    if (tipoComb == 'A' || tipoComb == 'a') {
        if (litro <= 20) {
            valor = (3.99 * litro)
            valor -= (0.03 * valor)
        } else {
            valor = (3.99 * litro)
            valor -= (0.05 * valor)
        }
        println("Valor a pagar: $valor")
    } else if (tipoComb == 'G' || tipoComb == 'g') {
        if (litro <= 20) {
            valor = (5.99 * litro)
            valor -= (0.04 * valor)
        } else {
            valor = (5.99 * litro)
            valor -= (0.06 * valor)
        }
        println("Valor a pagar: " + valor)
    }
}