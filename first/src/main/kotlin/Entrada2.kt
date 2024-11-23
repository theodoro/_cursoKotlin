class Entrada2 {

    fun inputUser2(){

        println("Insira o ID do produto:")
        val productId = readln().toInt()

        when(productId){
            1, 3 ->{
                println("Você ganhou 10% de desconto")
            }
            2 -> {
                println("Você ganhou 20% de desconto")
            }else ->{
                println("Compra aprovada!")
            }
        }
    }
}