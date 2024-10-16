// Lais M. T. Rangel

fun main() {
    var conta: Int
    var saldo: Float
    var debito: Float
    var credito: Float
    var saldoAtual: Float

    println("Insira o número da sua conta: ")
    conta = readln().toInt()

    println("Insira o saldo: ")
    saldo = readln().toFloat()

    println("Insira o debito: ")
    debito = readln().toFloat()

    println("Insira o crédito: ")
    credito = readln().toFloat()

    saldoAtual = saldo - debito + credito
    println("Saldo atual: $saldoAtual")

    if (saldoAtual >= 0){
        println("Saldo positivo")
    } else {
        println("Saldo negativo")
    }
}