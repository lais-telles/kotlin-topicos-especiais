// Lais M. T. Rangel

class PessoaJuridica: Pessoa {
    private var cnpj: String = ""
        set(value) {
            if (value != "")
                field = value
        }

    constructor(nome: String, rua: String, telefone: String, numero: Int, bairro: String, cidade: String, agencia: Int, conta: Int, saldo: Float, cnpj: String): super(nome, rua, telefone, numero, bairro, cidade, agencia, conta, saldo) {
        this.cnpj = cnpj
    }
}

