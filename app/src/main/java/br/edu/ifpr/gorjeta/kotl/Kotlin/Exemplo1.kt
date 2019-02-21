package br.edu.ifpr.gorjeta.kotl.Kotlin

import br.edu.ifpr.gorjeta.kotl.Java.Animal
import java.util.*


fun main(args: Array<String>) {
    println("Quem é você ?")
    val nome = readLine()
    println("Olá, $nome")


    //val idade = calcularIdade(2019,1988)
    val idade = calcularIdade(anoNascimento = 1995, anoAtual = 2019)

    println("Idade: $idade")

    val c = Calendar.getInstance()

    val animal = Animal()
    animal.nome = "Yoru"
    animal.raca = "Labrador"
    println(animal.nome)
    println(animal.raca)

    val pessoa = Pessoa("Mario", "Italiano")
    /*pessoa.nome = "Mario"
    pessoa.raca = "Italiano"*/
    println(pessoa.nome)
    println(pessoa.raca)

    val outro = PessoaFisica("Tafarellll","Curitibano","4161653321")
    println(outro.nome)
    println(outro.raca)
    println(outro.cpf)

}


/*fun calcularIdade(anoAtual: Int, anoNascimento: Int): Int {
    return anoAtual - anoNascimento
}*/

fun calcularIdade(anoAtual: Int = 2019, anoNascimento: Int) = anoAtual - anoNascimento



open class Pessoa(var nome: String, var raca: String)

class PessoaFisica(nome: String, raca: String, var cpf: String) : Pessoa(nome, raca)

//class Animal

class X