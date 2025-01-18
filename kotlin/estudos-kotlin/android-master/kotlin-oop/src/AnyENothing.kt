fun main(){
    var numero: Any = 10
    var texto: Any = "Texto"
    texto = 10

    println(numero)
    println(texto)
    infinito()
}

fun infinito(): Nothing {
    while (true) {
        println("Loop infinito")
    }
}