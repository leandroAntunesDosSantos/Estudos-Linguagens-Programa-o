const val PROCESSO = "fabricacao"

lateinit var usuario: Usuario

fun main() {
//    val carro = Carro("Sedan", "Preto", 1.5, 2.0, 4)
//    carro.detalhesVeiculo("Preto", "Sedan", 1.5, 2.0)
//    carro.marchas()
//    carro.quantidadePortas()
//    println("Tipo de Habilitação: ${carro.habilitacao()}")
//    carro.chameiTeste()
//
//    println()
//
//    val moto = Moto("Esportiva", "Vermelha", 1.0, 1.5)
//    moto.detalhesVeiculo("Azul", "Esportiva", 1.0, 1.5)
//    moto.marchas()
//    println("Tipo de Habilitação: ${moto.habilitacao()}")
//    transferencia()
//    println(soma(10, 20))
    usuario = Usuario()
    println(usuario.teste())
}

fun transferencia() {
    println("Transferência realizada com sucesso!")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun texto() : String {
    return "Texto criado na função texto"
}