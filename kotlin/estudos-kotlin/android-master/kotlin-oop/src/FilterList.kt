fun main(){
    val listaFilmes : MutableList<Filme> = mutableListOf(
        Filme(1, "Rei Leão", "Animação", 1994, "Infantil"),
        Filme(2, "Toy Story", "Animação", 1995, "Infantil"),
        Filme(3, "Procurando Nemo", "Animação", 2003, "Infantil"),
        Filme(4, "Madagascar", "Animação", 2005, "Infantil")
    )

    println(listaFilmes.filter { it.anoLancamento == 2003 })
}