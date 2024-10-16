open class ContaBancaria {
    var cliente: String = ""
    var num_conta: Int = 0
    var saldo: Float = 0f

    constructor(cliente: String, num_conta: Int, saldo: Float){
        this.cliente = cliente
        this.num_conta = num_conta
        this.saldo = saldo
    }

    open fun sacar (valor: Float) {
        if (valor <= saldo) {
            saldo -= valor
        } else {
            println("Saldo insuficiente")
        }
    }

    fun depositar (valor: Float) {
        saldo += valor
    }

    open fun exibirDados() {
        println("Cliente: $cliente")
        println("Número da Conta: $num_conta")
        println("Saldo: R$$saldo")
    }
}