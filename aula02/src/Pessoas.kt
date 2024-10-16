class Pessoas {
    private var nome: String = ""
    private var idade: Int = 0
    private var peso: Float = 0f
    private var altura: Float = 0f

    fun setNome (nome: String) {
        this.nome = nome
    }
    fun getNome (): String {
        return nome
    }

    fun setIdade (idade: Int) {
        this.idade = idade
    }
    fun getIdade (): Int {
        return idade
    }

    fun setPeso(peso: Float) {
        this.peso = peso
    }
    fun getPeso (): Float {
        return peso
    }

    fun setAltura (altura: Float) {
        this.altura = altura
    }
    fun getAltura (): Float {
        return altura
    }

    fun calcIMC ():Float {
        return (peso/(altura*altura))
    }
}

fun main () {
    var pessoa1: Pessoas = Pessoas()
    var pessoa2: Pessoas = Pessoas()
    var nome: String
    var idade: Int
    var peso: Float
    var altura: Float
    var IMC: Float

    println("Insira o nome da pessoa 1: ")
    nome = readln()
    pessoa1.setNome(nome)

    println("Insira a idade da pessoa 1: ")
    idade = readln().toInt()
    pessoa1.setIdade(idade)

    println("Insira o peso da pessoa 1: ")
    peso = readln().toFloat()
    pessoa1.setPeso(peso)

    println("Insira a altura da pessoa 1: ")
    altura = readln().toFloat()
    pessoa1.setAltura(altura)

    IMC = pessoa1.calcIMC()

    println("Pessoa 1:")
    println("Nome: ${pessoa1.getNome()}, Idade: ${pessoa1.getIdade()}, Peso: ${pessoa1.getPeso()}, Altura: ${pessoa1.getAltura()}, IMC: ${pessoa1.calcIMC()}")

    if (IMC <= 18.5F){
        println("Abaixo do peso")
    } else if (IMC > 18.5F && IMC < 25F) {
        println("Peso normal")
    } else if (IMC >= 25F && IMC < 30F) {
        println("Acima do peso")
    } else if (IMC >= 30F && IMC < 35F) {
        println("Obesidade grau I")
    } else if (IMC >= 35F && IMC < 40F) {
        println("Obesidade grau II")
    } else if (IMC >= 40F) {
        println("Obesidade grau III")
    }
}