fun main() {

    // Formas de definir variaveis
    // definição de tipo explicita

    val estrada: String = "Meia nove"

    //Definição implicita

    val caminhao = "Vermelhão"

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
    val n1: Int = numberByte.toInt()
    println(n1)

    val n2: String = numberByte.toString()
    println(n2)

    val n3: Float = numberByte.toFloat()
    println(n3)

// entendendo variaveis Var é mutavel e Val imutavel
    var nome = "luis"
    nome = "leonardo"
    val carro = "corola"
//   Erro de sintaxe carro = "fusca"

// Interpolação com variaveis

    var number = 2
    var number2 = 3

    println("Hoje é dia $number e amanhã é dia $number2")
    println("Daqui três dias é dia ${number2 + number}")

// Teste com condições

    if (number > number2) {
        println("Numero 1 é maior que numero 2")
    } else {
        println("Numero 2 é maior que numero 1")
    }
    if (number2 in 1..10) {
        println("Numero 2 estar no intervalo de 1 a 10")
    }
    when (number2) {
        0 -> println("numero igual a zero")
        in 1..10 -> ("Numero no intervalo de 1 a 10")
        else -> println("Numero não alcançou nenhuma dessa condições")
    }

// Testando nulos (estudar mais depois)

    var etd = null

    var test: Int? = etd

    if (number == null) {
        number = number.dec()
    }

// estudando vetores e loops
// lista imutavel
    var listTop = listOf("Luiz", "Vaca", "Pedra")
    println(listTop)

    val myList = mutableListOf("Luiz", "Vaca", "Pedra")
    myList.remove("Pedra")

    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))

    val array = Array (5) {it * 2}
    println(java.util.Arrays.toString(array))

// Existem diferentes tipagens para os arrays e listas

// Repetiçoes

    for(element in school){
        print(element + " ")
    }
    for((index ,element) in school.withIndex()){
        println("seu elemento é $element e sua posição ${index + 1}")
    }
    for (i in 1..5) print(i)
    println(" ")
    for (i in 5 downTo 1 ) print(i)
    println(" ")
    for (i in 2..10 step 2 ) print(i)
    println(" ")
    for (i in 'a'..'d' ) print(i)
    println(" ")

    // Outros tipos de repetição
    var numberRepeat = 0
    while (numberRepeat < 10) {
    numberRepeat++
    }
    println(numberRepeat)
    do {
        numberRepeat--
    } while (numberRepeat > 10)
    println("$numberRepeat tem seu valor mudado")

    repeat(2){
        print("Eu sou demais ")
    }
}
