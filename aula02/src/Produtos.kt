class Produtos {
    var codigo: Int = 0
    var nome: String = ""
    var quantidade: Int = 0
    private var preco: Double = 0.0

    fun setcodigo(codigo: Int) {
        this.codigo = codigo
    }

    fun getcodigo():Int {
        return codigo
    }

    fun setnome(nome: String) {
        this.nome = nome
    }

    fun getnome():String {
        return nome
    }

    fun setquantidade(quantidade: Int) {
        this.quantidade = quantidade
    }

    fun getquantidade():Int {
        return quantidade
    }

    fun setpreco(preco: Double) {
        this.preco = preco
    }

    fun getpreco():Double {
        return preco
    }
}

fun main() {
    var arroz: Produtos = Produtos()
    var codigo: Int
    var nome: String
    var quantidade: Int
    var preco: Double

    println("Digite o código do arroz: ")
    codigo = readln().toInt()
    arroz.setcodigo(codigo)

    println("Digite o nome do produto: ")
    nome = readln()
    arroz.setnome(nome)

    println("Código do arroz é ${arroz.getcodigo()}")
    println("Nome do arroz é ${arroz.getnome()}")
}
