fun main(){
    val usuario = DadosUsuario()
    val user = usuario.usuario("João", "Silva", 30)
    val user2 = usuario.usuario("Maria", "Silva", 25)
    println(user)
    println(user2)
}