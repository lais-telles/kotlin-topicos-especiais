// Lais M. T. Rangel

fun main() {
    var p1: PessoaFisica = PessoaFisica("Lais", "Rua 01", "999997", 48, "Jardim das Flores", "Campinas", 123, 12345, 1200.20F, "55555")

    p1.visualizarConta()
    p1.cadastrarConta()
    p1.visualizarConta()

    var p2: PessoaJuridica = PessoaJuridica("McDonalds", "Rua 02", "999998", 24, "Jardim das Plantas", "Campinas", 123, 2555, 120000.20F, "1455665")

    p2.visualizarConta()
    p2.cadastrarConta()
    p2.visualizarConta()
}