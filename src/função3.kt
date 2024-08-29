fun main() {
    media ("Tópicos 2", 7.5f, 8.5f)
    media (nota1 = 6.5f, disciplina = "Tópicos 2", nota2 = 8.5f)
}

fun media(disciplina: String, nota1: Float, nota2: Float) {
    var media: Float
    media = (nota1 + nota2) / 2

    println("A média da disciplina $disciplina foi $media")
}