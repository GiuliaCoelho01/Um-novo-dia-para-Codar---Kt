
//Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida,
// Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.
data class Estudantes(val nome: String)

fun main(){
            val estudantes = mutableListOf<Estudantes>()
            println("=== LISTA DE ALUNOS ===")
            println("Digite o nome do estudante para cadastrar.")
            println("Digite 'PARE' a qualquer momento para ver a lista e sair.\n")

    while (true) {
        println("Nome do estudante:")
        val entrada = readlnOrNull()


        if (entrada?.uppercase() == "PARE") {
            break
        }


        if (!entrada.isNullOrBlank()) {
            estudantes.add(Estudantes(entrada))
            println("Estudante adicionado!")
        }
    }


    println("=== RESULTADO FINAL ===")
    println("Total de estudantes cadastrados: ${estudantes.size}")

    for (estudante in estudantes) {
        println("- ${estudante.nome}")
    }

        }


