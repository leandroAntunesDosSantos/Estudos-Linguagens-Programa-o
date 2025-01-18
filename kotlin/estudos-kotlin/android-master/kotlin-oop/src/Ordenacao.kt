fun main(){
    val lista = mutableListOf("E", "D", "C", "B", "A")
    println("Lista desordenada: $lista")
    lista.sort()
    println("Lista ordenada: $lista")
    lista.sortDescending()
    println("Lista ordenada de forma decrescente: $lista")
    lista.shuffle()
    println("Lista embaralhada: $lista")
    lista.reverse()
    println("Lista invertida: $lista")
}