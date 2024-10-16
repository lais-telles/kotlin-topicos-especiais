import kotlin.math.sqrt

class Triangulo (){
    var a = 0.0
    var b = 0.0
    var c = 0.0

    constructor(ladoa: Double, ladob: Double, ladoc: Double): this() {
        a = ladoa
        b = ladob
        c = ladoc
    }

    fun area(): Double {
        var p = (a + b + c)/2
        return sqrt(p*(p-a)*(p-b)*(p-c))
    }
}

fun main() {
    var ladoa: Double
    var ladob: Double
    var ladoc: Double

    println("Digite os lados: ")
    ladoa = readln().toDouble()
    ladob = readln().toDouble()
    ladoc = readln().toDouble()

    var tri: Triangulo = Triangulo()
    tri.a = ladoa
    tri.b = ladob
    tri.c = ladoc

    println("Area do triangulo: ${tri.area()}")

    var tri2 : Triangulo = Triangulo(ladoa, ladob, ladoc)
    println("Área do triangulo constructor: ${tri2.area()}")
}
