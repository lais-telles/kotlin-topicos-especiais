// Lais M. T. Rangel

class PessoaFisica: Pessoa {
    private var cpf: String = ""
        set(value) {
            if (value != "")
                field = value
        }

    constructor(nome: String, rua: String, telefone: String, numero: Int, bairro: String, cidade: String, agencia: Int, conta: Int, saldo: Float, cpf: String): super(nome, rua, telefone, numero, bairro, cidade, agencia, conta, saldo) {
        this.cpf = cpf
    }
}