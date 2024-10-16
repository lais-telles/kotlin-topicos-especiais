class alunoGraduacao: Aluno {
    var tg: String = ""
        set(value) {
            if (value != "")
                field = value
        }
    var estagio: String = ""
        set(value) {
            if (value != "")
                field = value
        }

    constructor(ra: Int, nome: String, curso: String, email: String, tg: String, estagio: String): super(ra, nome, curso, email){
        this.tg = tg
        this.estagio = estagio
    }
}