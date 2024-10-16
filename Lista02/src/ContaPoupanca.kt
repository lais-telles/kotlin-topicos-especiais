class ContaPoupanca: ContaBancaria {
    var dia_rendimento: Int = 0

    constructor(cliente: String, num_conta: Int, saldo: Float, dia_rendimento: Int): super(cliente, num_conta, saldo) {
        this.dia_rendimento = dia_rendimento
    }

    fun calcularNovoSaldo (taxaRendimento: Float) {
        saldo += (taxaRendimento * saldo) / 100
    }
}