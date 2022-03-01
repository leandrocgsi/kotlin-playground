package br.com.erudio.section05._0504

interface Vehicle {

    val makeName: String

    fun go() {
        println("Ruuuuuuuuuunnnnn")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int
}