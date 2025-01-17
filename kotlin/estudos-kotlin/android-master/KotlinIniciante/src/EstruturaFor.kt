fun main(){
    for (contador in 0 ..  9){
        println("Contador: $contador")
    }
    println()
    var listaNumeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in 0 until listaNumeros.size){
        println("Elemento: ${listaNumeros[i]}")
    }
}