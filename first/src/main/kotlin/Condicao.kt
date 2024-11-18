class Condicao {

    fun condicao(){

        val product = "ABC"
        val price = 30_000

        if (product.length <= 3){
            println("Seu produto se chama $product. Ele precisa ter mais de 3 caracteres")
        }else{
            println("Produto $product cadastrado com sucesso")
        }

        if (price >= 20_000){
            println("Seu produto custou $price você ganhou 10% de desconto e o valor ficou ${price - (price * 0.10)}")
        }else{
            println("Produto sem desconto")
        }
    }
}