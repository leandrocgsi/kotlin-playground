package br.com.erudio.section05._0502

//class Person(firstName: String, lastName: String) {
class Person internal constructor (firstName: String, lastName: String) {
    init {
        println("Create a person named $firstName $lastName")
    }

    constructor (firstName: String, lastName: String, middleName: String) :
            this(firstName, lastName)
}