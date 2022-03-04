package br.com.erudio.section07._0705

fun main() {

    showComponents()
    return
    val p1 = Coordinates(200, 100)
    val p2 = Coordinates(1000, 2000)
    val p3 = p1 + p2
    println(p3)

    val (xCoordinate, yCoordinate) = p3
    println("xCoordinate = $xCoordinate, yCoordinate = $yCoordinate")
    println("c1 = ${p3.component1()}")
}

class Point(val x: Int, val y: Int, val z: Int) {
    operator fun component1(): Int = x
    operator fun component2(): Int = y
    operator fun component3(): Int = z
}

fun showComponents(){
    val myPoint = Point(5000, 500, 60000)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}