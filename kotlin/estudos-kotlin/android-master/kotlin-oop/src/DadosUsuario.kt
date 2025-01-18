class DadosUsuario {
    fun dadosUsuario(nome: String,sobrenome: String, idade: Int ): String {
        return "Nome: $nome, Sobrenome: $sobrenome, Idade: $idade"
    }

    val usuario: (String, String, Int) -> String = :: dadosUsuario
}