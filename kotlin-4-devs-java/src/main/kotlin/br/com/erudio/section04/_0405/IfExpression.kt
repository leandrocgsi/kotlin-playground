package br.com.erudio.section04._0405

fun main() {
    val myInt = 199
    val anInt: Int = 7

    // Java int lowest = (myInt < anInt) ? myInt : anInt;

    val lowest = if ( myInt < anInt) myInt else anInt
    println("The lowest value is $lowest")

    val temp = 26
    val isAirConditionerOn = if (temp >= 26){
        println("It is warm")
        true;
    } else {
        println("It is not so warm")
        false;
    }
    println("Is the air conditioner on: $isAirConditionerOn")
}