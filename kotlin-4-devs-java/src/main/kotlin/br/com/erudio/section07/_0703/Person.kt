package br.com.erudio.section07._0703

@Deprecated("Use the Animal class instead", ReplaceWith("Animal"))
class Person internal constructor (firstName: String, lastName: String) {
    init {
        println("Create a person named $firstName $lastName")
    }

    constructor (firstName: String, lastName: String, middleName: String) :
            this(firstName, lastName)
}