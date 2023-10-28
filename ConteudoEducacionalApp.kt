import entity.ConteudoEducacional
import entity.Formacao
import enums.Nivel
import entity.Usuario
import java.util.*

fun main() {

    val conteudosEducationais = mutableListOf<ConteudoEducacional>()
    val formacoes = mutableListOf<Formacao>()

    conteudosEducationais.add(ConteudoEducacional("Java", 120, Nivel.BASICO))
    conteudosEducationais.add(ConteudoEducacional("Java: Estrutura de Dados", 45, Nivel.INTERMEDIARIO))
    conteudosEducationais.add(ConteudoEducacional("Spring-Boot", 90, Nivel.AVANCADO))

    val formacao = Formacao("Back-End", conteudosEducationais)
    formacao.matricular(Usuario(UUID.randomUUID(), "Fulano de Tal"))

    formacoes.add(formacao)

    print(formacoes)
    println()
    formacoes.forEach{ _ -> formacao.listarInscritos() }

}
