fun main(){
    var contador = 0
    while(contador < 10){
        println("Contador: $contador")
        contador++
    }
    println()
    var listaNumeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var i = 0

    while (i < listaNumeros.size){
        println("Elemento: ${listaNumeros[i]}")
        i++
    }
}