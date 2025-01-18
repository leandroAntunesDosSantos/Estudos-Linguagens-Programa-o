fun main(){
    val filmesQualquer : MutableList<Filme> = mutableListOf(
        Filme(1, "Rei Leão", "Animação", 1994, "Infantil"),
        Filme(2, "Toy Story", "Animação", 1995, "Infantil"),
        Filme(3, "Procurando Nemo", "Animação", 2003, "Infantil"),
        Filme(4, "Madagascar", "Animação", 2005, "Infantil")
    )

    filmesQualquer.let { it ->
        val filmeMap = hashMapOf(
            "id" to it[0].id,
            "nome" to it[0].titulo,
            "genero" to it[0].genero,
            "anoLancamento" to it[0].anoLancamento,
            "genero" to it[0].genero

        )
        println(filmeMap)
    }
}