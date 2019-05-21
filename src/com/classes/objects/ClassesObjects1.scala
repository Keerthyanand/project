package com.classes.objects

class Messager {

   var message: String = "Hello World!"

   def getMessage(): String = {
     s"Message : ${message}"
   }

}

class Point(val xc: Int,val yc: Int) {
   var x: Int = xc
   var y: Int = yc

   def getValue(): String = {
      x = x + 1
      y = y + 1
      s"x = $x, y = $y"
   }

   def getConstructorValue(): String = {
     s"xc = $xc, yc = $yc"
   }


}

class Point3D(override val xc: Int,
              override val yc: Int, val zc: Int)
      extends Point(xc,yc) {
//     var x: Int = xc
     var z: Int = zc

     def move(dx: Int,dy: Int,dz: Int): String = {

        x = x + dx
        y = y + dy
        z = z + dz

        s"x = $x, y = $y, z = $z"
     }
}

object ClassesObjects1 {

  def main(args: Array[String]): Unit = {

    var messager: Messager = new Messager()

    println(messager.message)
    println(messager.getMessage())

    var point1 = new Point(10, 20)

    println(point1.getValue())
    println(point1.getValue())
    println(point1.getValue())

    println(point1.getConstructorValue())

    var point2 = new Point3D(10, 20, 30)

    println(point2.move(9, 9, 9))
    println(point2.getValue())

  }

}
