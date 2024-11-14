fun main() {
    println("Hello World!")

    var name = "Ubuntu"
    var version = "Estou usando a versão 24.04 LTS"
    val byte: Byte = 8
    println(name)
    println(version)
    println(byte)
    // VAL é uma variavel imutavel
    // Declarando o tipo de variavel

    var preco: Double = 1.99
    val idade: Int = 38
    val marca: String = "Android"

    //:: class para mostrar o tipo de dado

    println(marca::class)
    println(idade::class)
    print(preco::class)
    /* forçando erro de compilação

    var result = 10 / 0
    println(result)*/
}