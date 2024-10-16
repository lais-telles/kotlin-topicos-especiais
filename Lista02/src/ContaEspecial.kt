class ContaEspecial: ContaBancaria {
    var limite: Float = 0f

    constructor(cliente: String, num_conta: Int, saldo: Float, limite: Float): super(cliente, num_conta, saldo){
        this.limite = limite
    }

    override fun sacar (valor: Float) {
        var aux: Float = saldo - valor

        if (aux >= 0) {
            saldo -= valor
        } else if (aux < 0) {
            aux *= -1
            if (aux <= limite) {
                saldo -= valor
            } else {
                println("Limite insuficiente")
            }
        }
    }

    override fun exibirDados() {
        super.exibirDados()
        println("Limite: R$$limite")
    }

}