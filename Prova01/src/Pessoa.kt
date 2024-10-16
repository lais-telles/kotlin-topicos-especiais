// Lais M. T. Rangel

open class Pessoa() {
    var nome: String = ""
    var rua: String = ""
    var telefone: String = ""
    var numero: Int = 0
    var bairro: String = ""
    var cidade: String = ""
    private var agencia: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }
    private var conta: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }
    private var saldo: Float = 0.0F
        set(value) {
            if (value > 0.0)
                field = value
        }

    constructor(nome: String, rua: String, telefone: String, numero: Int, bairro: String, cidade: String, agencia: Int, conta: Int, saldo: Float): this(){
        this.nome = nome
        this.rua = rua
        this.telefone = telefone
        this.numero = numero
        this.bairro = bairro
        this.cidade = cidade
        this.agencia = agencia
        this.conta = conta
        this.saldo = saldo
    }

    fun cadastrarConta () {
        println("Insira o numero da conta: ")
        conta = readln().toInt()
    }

    fun visualizarConta() {
        println("Número da conta: ${this.conta}")
    }
}