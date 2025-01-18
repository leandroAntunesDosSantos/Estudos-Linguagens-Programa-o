open class Veiculo : IVeiculo {
    private var tipo: String = ""
    private var cor: String = ""
    private var altura: Double = 0.0
    private var largura: Double = 0.0

    constructor(tipo: String, cor: String, altura: Double, largura: Double) {
        this.tipo = tipo
        this.cor = cor
        this.altura = altura
        this.largura = largura
    }

    override fun detalhesVeiculo(cor: String, tipo: String, altura: Double, largura: Double) {
        println("Tipo: $tipo")
        println("Cor: $cor")
        println("Altura: $altura")
        println("Largura: $largura")
    }

    override fun marchas() {
        println("Quantidade de marchas: 5")
    }

    override fun habilitacao(): String {
        return "N/A"
    }
}