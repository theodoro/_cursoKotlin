import javax.swing.text.StyledEditorKit.BoldAction

fun main() {
    println("Hello World!")

    var name = "Ubuntu"
    var version = "Estou usando a versão 24.04 LTS"
    val byte: Byte = 8

    val long: Long = 12345678999
    println(name)
    println(version)
    println(byte)
    println(long)
    // VAL é uma variavel imutavel
    // Declarando o tipo de variavel

    var preco: Double = 1.99
    val idade: Int = 38
    val marca: String = "Android"


    val char: Char = '@'
    val boolean : Boolean = true

    //:: class para mostrar o tipo de dado

    println(marca::class)
    println(idade::class)
    print(preco::class)
    println(char::class)
    println(boolean::class)
    /* forçando erro de compilação

    var result = 10 / 0
    println(result)*/

    Desafio01().messager()

}