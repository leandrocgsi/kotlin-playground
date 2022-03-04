package br.com.erudio.section07._0704

fun main() {

    val stan = Person("Stan", "Lee")

    val kClass = stan::class
    //val kClass = stan.javaClass.kotlin
    println("Simple name = ${kClass.simpleName}")

    for (fields in kClass.java.declaredFields) {
        println("Property name = $fields")
        println("Property name = ${fields.name}")
    }

    for (constructor in kClass.constructors) {
        println("Constructor = $constructor")
        println("Constructor Return = ${constructor.returnType}")
        println("Constructor Parameters = ${constructor.parameters}")
    }

    //for (name in kClass.members.distinct()) {
    //for (name in kClass.constructors) {
    /*for (name in kClass.members) {
        //println("Property name = $name")
        println("Property name = ${name.name}")
    }*/
}