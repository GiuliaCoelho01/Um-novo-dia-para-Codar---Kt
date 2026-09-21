
//Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.
//Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista". Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
//Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no nosso mercado".
//Quando o usuário digitar "PARE", exiba a lista de frutas restantes.
//Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".



fun main() {
    var frutas = mutableListOf("Banana", "Maçã", "Laranja", "Uva", "Morango")



    while (frutas.isNotEmpty()) {
        println("\nLista de Frutas: $frutas")
        println("Digite uma fruta para remover ou 'PARE' para sair:")

        val resposta = readlnOrNull()


        if (resposta == "PARE") {
            println("Lista de frutas restantes: $frutas")
            break
        }


        if (resposta in frutas) {
            frutas.remove(resposta)
            println("Fruta foi retirada da lista")
        } else {
            println("Fruta indisponível no nosso mercado")
        }
    }

    if (frutas.isEmpty()) {
        println("Lista de compras finalizada")
    }
}


