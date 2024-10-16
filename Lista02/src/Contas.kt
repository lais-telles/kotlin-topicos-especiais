fun main() {
    // Instancia das contas
    val contaBancaria = ContaBancaria("Cliente1", 12345, 1000f)
    val contaPoupanca = ContaPoupanca("Cliente2", 67890, 2000f, 10)
    val contaEspecial = ContaEspecial("Cliente3", 11223, 1500f, 500f)

    contaBancaria.sacar(200f)

    contaPoupanca.sacar(300f)

    contaEspecial.sacar(1600f)

    contaBancaria.depositar(500f)

    contaPoupanca.depositar(400f)

    contaEspecial.depositar(300f)

    contaPoupanca.calcularNovoSaldo(5f)

    println("\nDados da ContaBancaria:")
    contaBancaria.exibirDados()

    println("\nDados da ContaPoupanca:")
    contaPoupanca.exibirDados()

    println("\nDados da ContaEspecial:")
    contaEspecial.exibirDados()
}
