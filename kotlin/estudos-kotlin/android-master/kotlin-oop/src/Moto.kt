class Moto(tipo: String, cor: String, altura: Double, largura: Double) : Veiculo(tipo, cor, altura, largura) {
    override fun habilitacao(): String {
        return "A"
    }
}