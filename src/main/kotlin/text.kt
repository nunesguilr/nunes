fun main(){
    println("Hello World")

    // Testando variaveis
    val i: Int = 2
    val b1 = i.toByte()
    println(b1)

    val numberByte: Byte = 2

    /*Erros de sintaxe abaixo por causa do tipo de variavel
val n1: Int = numberByte
val n2: String = numberByte
val n3: Double = numberByte
*/

// funcionalidade to permite mudar o tipo do valor da variavel
    val n1 : Int = numberByte.toInt()
    println(n1)

    val n2 : String = numberByte.toString()
    println(n2)

    val n3 : Float = numberByte.toFloat()
    println(n3)

// entendendo variaveis Var é mutavel e Val imutavel
    var nome = "luis"
    nome  = "leonardo"



}
