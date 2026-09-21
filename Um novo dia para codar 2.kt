//Exiba uma lista de planetas do sistema solar ("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno" e "Plutão") para o usuário.
// Em seguida, peça ao usuário para digitar o nome de um planeta. Verifique se o planeta que o usuário informou está na lista e informe ao usuário.
fun main() {
    val Planetas = arrayOf("Mércurio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão")

    println("Escreva o nome de um planeta:")
    val resposta = readlnOrNull()

    if (resposta in Planetas) {
        println("Isso é um planeta! Parabéns!")
    } else {
        println("Esse planeta não está na lista ou foi digitado incorretamente.")
        println("Digite novamente:")
        val resposta = readlnOrNull()
        println("Isso é um planeta! Parabéns!")
    }
}
