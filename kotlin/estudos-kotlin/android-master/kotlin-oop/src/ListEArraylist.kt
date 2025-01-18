
fun main(){
    val listaFilmes = listOf("Rei Leão", "Toy Story", "Procurando Nemo") // Lista imutável - List
    println(listaFilmes)


    val listaFilmes2 = arrayListOf("Rei Leão", "Toy Story", "Procurando Nemo") // Lista mutável - ArrayList
    listaFilmes2.add("Madagascar")
    listaFilmes2.add("Shrek")
    listaFilmes2.remove("Rei Leão")
    listaFilmes2[0] = "Resident Evil"
    println(listaFilmes2)

    val listaFilmes3 = mutableListOf("Velozes e Furiosos", "Harry Potter", "Senhor dos Anéis") // Lista mutável - MutableList
    listaFilmes3.add("Piratas do Caribe")
    listaFilmes3.add("Matrix")
    listaFilmes3.remove("Harry Potter")
    listaFilmes3[0] = "O Poderoso Chefão"
    println(listaFilmes3)
    if (listaFilmes3.isEmpty()) {
        println("Lista 3 vazia")
    } else {
        println("Lista 3 não vazia")
    }

}