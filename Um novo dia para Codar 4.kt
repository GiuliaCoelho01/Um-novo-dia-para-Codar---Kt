
data class Contato(val nome: String, val telefone: String)

fun main() {
    val contatos = mutableListOf<Contato>()

    println("=== AGENDA DE CONTATOS ===")
    println("Comandos: ADICIONAR, BUSCAR, REMOVER, LISTAR, SAIR")

    while (true) {
        print("\nDigite um comando: ")
        val comando = readLine()?.uppercase() ?: ""

        when (comando) {
            "ADICIONAR" -> {
                print("Nome: ")
                val nome = readLine() ?: ""
                print("Telefone: ")
                val telefone = readLine() ?: ""
                contatos.add(Contato(nome, telefone))
                println("Contato adicionado!")
            }

            "BUSCAR" -> {
                print("Qual nome deseja buscar? ")
                val nomeBusca = readLine() ?: ""
                // Procura na lista um contato com o mesmo nome (ignorando maiúsculas/minúsculas)
                val contatoEncontrado = contatos.find { it.nome.equals(nomeBusca, ignoreCase = true) }

                if (contatoEncontrado != null) {
                    println("Telefone: ${contatoEncontrado.telefone}")
                } else {
                    println("Contato não encontrado")
                }
            }

            "REMOVER" -> {
                print("Qual nome deseja remover? ")
                val nomeRemover = readLine() ?: ""
                // O removeIf deleta o item que bater com a condição e retorna 'true' se conseguiu
                val conseguiuRemover = contatos.removeIf { it.nome.equals(nomeRemover, ignoreCase = true) }

                if (conseguiuRemover) {
                    println("Contato removido com sucesso!")
                } else {
                    println("Contato não encontrado")
                }
            }

            "LISTAR" -> {
                println("--- LISTA DE CONTATOS ---")
                if (contatos.isEmpty()) {
                    println("A agenda está vazia.")
                } else {
                    for (contato in contatos) {
                        println("Nome: ${contato.nome} | Telefone: ${contato.telefone}")
                    }
                }
            }

            "SAIR" -> {
                println("Agenda encerrada. Total de contatos: ${contatos.size}")
                break // Encerra o loop while(true)
            }

            else -> {
                println("Comando inválido. Use ADICIONAR, BUSCAR, REMOVER, LISTAR ou SAIR.")
            }
        }
    }
}