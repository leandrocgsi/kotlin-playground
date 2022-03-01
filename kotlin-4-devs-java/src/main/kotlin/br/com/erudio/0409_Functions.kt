package br.com.erudio

fun main() {
    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("20 + 20 = ${myExpressionBodyFunction(20, 20)}")
    println("10 + 10 = ${myExpressionBodyFunctionWithInference(10, 10)}")
    println("10 + 20 without Defaults = ${myFuntionWithDefaults(10, 20, "Hello")}")
    println("1 + 5 with Defaults = ${myFuntionWithDefaults(message = "Greetings")}")
}

fun myMathFunction(number1: Int, number2: Int) : Int {
    return number1 + number2
}

fun myExpressionBodyFunction(number1: Int, number2: Int) : Int = number1 + number2

fun myExpressionBodyFunctionWithInference(number1: Int, number2: Int) = number1 + number2

fun myFuntionWithDefaults(number1: Int = 1, number2: Int =  5, message: String = "Hi") : Int {
    val results = number1 + number2
    println(message)
    return results
}