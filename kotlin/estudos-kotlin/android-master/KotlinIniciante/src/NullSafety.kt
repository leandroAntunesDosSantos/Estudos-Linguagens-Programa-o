fun main(){
    var nome: String? = null //? pode ser nulo
    nome = "labrador"
    println(nome?.length)

    var nome2: String? = null
    nome2 = "Tangamandapio"

    if (nome2 != null){
        println(nome2.length)
    } else {
        println("Nome nulo")
    }

    println(nome2!!.length) //nao pode ser nulo ocorre nullpointerexception se for nulo
    // erro muito comum em java



}