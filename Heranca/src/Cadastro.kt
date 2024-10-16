fun main(){
    var matricula: Int = 0
    var nome: String = ""
    var salario: Double = 0.0
    var curso: String = ""

    println("Cadastro")
    print("Digite o numero de matricula: ")
    matricula = readln().toInt()
    print("Digite o nome: ")
    nome = readln()
    print("Digite o valor do salario: ")
    salario = readln().toDouble()
    print("Digite o curso lecionado: ")
    curso = readln()

    var prof1: Professor = Professor(matricula, nome, salario, curso)
    println("Matrícula do professor: ${prof1.matricula}")
    println("Nome do professor: ${prof1.nome}")
    println("Salario do professor: ${prof1.salario}")
    println("Curso do professor: ${prof1.curso}")
}
