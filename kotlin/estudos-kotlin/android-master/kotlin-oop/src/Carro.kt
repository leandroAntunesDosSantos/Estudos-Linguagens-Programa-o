class Carro(tipo: String, cor: String, altura: Double,largura: Double, qtdPortas: Int)
    : Veiculo(tipo, cor, altura, largura) {

    private var qtdPortas: Int = qtdPortas
    override fun habilitacao(): String {
        return "B"
    }

    fun quantidadePortas(){
        println("Quantidade de portas: ${this.qtdPortas}")
    }

    fun chameiTeste(){
        this.teste()
    }

    private fun teste(){
        println(PROCESSO)
    }
}


