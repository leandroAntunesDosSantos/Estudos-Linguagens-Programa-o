fun main(){
    val mapa = hashMapOf(
        "nome" to "João",
        "idade" to 25,
        "altura" to 1.75,
        "peso" to 80,
        "corOlhos" to "castanho",
        "sexo" to "masculino",
        "nacionalidade" to "brasileiro"
    )
    println(mapa)
    println(mapa["nome"])
    println(mapa["idade"])
    println(mapa["altura"])
    println(mapa["peso"])
    println(mapa["corOlhos"])
    println(mapa["sexo"])
    println(mapa["nacionalidade"])
    mapa["nome"] = "Maria"
    println(mapa)
    mapa["peso"] = 70
    println(mapa)
    mapa.remove("idade")
    println(mapa)
    println(mapa.size)
    mapa.clear()
    println(mapa)
    println(mapa.isEmpty())
}