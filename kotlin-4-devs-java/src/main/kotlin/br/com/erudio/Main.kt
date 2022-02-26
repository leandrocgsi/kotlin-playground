package br.com.erudio

/*fun main(args: Array<String>) {
    println("Hello, World!!!")
}*/

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin World"
    println(args.any())
    println("Hello, $name!!!")
}