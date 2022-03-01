package br.com.erudio

fun fizzBuzz1(n: Int): List<String> {

    val list = mutableListOf<String>()

    for (it in 1..n) {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz" // also (it % 15 == 0) because 3x5=15
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }
    return list
}

fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()

    (1..n).forEach {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz" // also (it % 15 == 0) because 3x5=15
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }

    return list
}