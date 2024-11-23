class Entradas {

    fun inputUser(){
        println("Informe um nome:")
        val name = readln()

        if (name.length < 3){
            println("Nome $name é invalido, pois precisa de mais de 3 caracter")
        }else{
            println("Nome $name cadastrado com sucesso!")
        }
    }
}