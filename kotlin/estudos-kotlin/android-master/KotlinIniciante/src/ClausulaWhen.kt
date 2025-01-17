fun main(){
    var opcao = 3
    when(opcao){
        1 -> println("Suco de laranja")
        2 -> println("Água")
        3 -> println("Suco de tamarindo")
        else -> println("Opção inválida")
    }
    // when é semelhança ao switch do Java

    var mensagem = when(opcao){
        1 -> "Suco de laranja"
        2 -> "Água"
        3 -> "Suco de tamarindo"
        else -> "Opção inválida"
    }
    println(mensagem)
}