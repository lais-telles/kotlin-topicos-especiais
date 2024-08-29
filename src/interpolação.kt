fun main(){
    var valor1: Float
    var valor2: Float
    var resultado: Float

    println ("Entre com valor1: ")
    valor1 = readln().toFloat()
    println("Entre com valor2: ")
    valor2 = readln().toFloat()

    resultado = valor1 + valor2
    println("A soma de " +valor1+ " com " +valor2+ " é " +resultado)
    println("A soma de $valor1 com $valor2 é $resultado")
}