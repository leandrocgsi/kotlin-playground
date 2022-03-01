package br.com.erudio

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin World"
    println("Hello, $name!!!")

    // I am a commentary
    // val myPhrase = "I'm a String"

    /* I am a comment too
       I am a block comment
    val myPi = 3.14
    val myAnswer = 42
    */

    val aString: String
    val aDouble: Double
    val aInt: Int

    val myDouble = 1.999
    val myFloat = 1.9F
    val myLong = 32132323331L
    val myInt = 199
    val myShort: Short = 12
    var myByte: Byte = -128

    val anInt: Int = 7
    val aLong: Long = anInt.toLong()
}

/* I am also a comment
fun fooBar() {
    /*
        I am a embedded comment
    */
}
*/