class Message {

    fun writeMessage(){
        val writeM  = "Olá Bruno. \nSeu Produto chegou"
        println(writeM)

        val csv = """
            Texto1
            Texto2
        """.replaceIndent(newIndent = ";")
        println(csv)

        val name = "Bruno"
        val price = 31
        val age = 38

        println("Ola, $name. Sua idade é $age. Seu desconto é ${price * 0.10}")
    }
}