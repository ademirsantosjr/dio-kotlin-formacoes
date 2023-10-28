data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    private var inscritos = mutableListOf<Usuario>()
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    fun listarInscritos() {
        inscritos.forEach{ inscrito -> print("$inscrito") }
    }
}