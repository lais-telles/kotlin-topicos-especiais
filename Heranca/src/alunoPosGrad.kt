class alunoPosGrad: Aluno {
    var dissertacao: String = ""
        set(value) {
            if (value != "")
                field = value
        }

    constructor(ra: Int, nome: String, curso: String, email: String, dissertacao: String): super(ra, nome, curso, email){
        this.dissertacao = dissertacao
    }
}