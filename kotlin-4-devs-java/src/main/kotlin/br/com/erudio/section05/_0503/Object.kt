package br.com.erudio.section05._0503

fun main() {

     val location = object {
          var xCoordinate = 200
          var yCoordinate = 400
     }

     println("Coordinates = (${location.xCoordinate}, ${location.yCoordinate})")

     val location2 = object {
          var xCoordinate = 300
          var yCoordinate = 500
          fun printIt(){
               println("Coordinates = ($xCoordinate, $yCoordinate)")
          }
     }
     location2.printIt()
     location2.xCoordinate = 2000
     location2.yCoordinate = 4000
     location2.printIt()

     val temperature = MySingleton.getLastTemperature()
     println("Last temperature measured = $temperature degrees")
}

object MySingleton {
     var temperatures = arrayOf(18, 22, 26)
     fun getLastTemperature() = temperatures.last()
}