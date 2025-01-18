interface IVeiculo {
    fun detalhesVeiculo(cor: String, tipo: String, altura: Double, largura: Double)
    fun marchas()
    fun habilitacao(): String
}