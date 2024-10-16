open class Aluno {
    var ra: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }
    var nome: String = ""
        set(value) {
            if (value != "")
                field = value
        }
    var curso: String = ""
        set(value) {
            if (value != "")
                field = value
        }
    var email: String = ""
        set(value) {
            if (value != "")
                field = value
        }

    constructor(ra: Int, nome: String, curso: String, email: String){
        this.ra = ra
        this.nome = nome
        this.curso = curso
        this.email = email
    }
}