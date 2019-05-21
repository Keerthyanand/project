package com.classes.objects

trait Equal {
   def isEqual(x: Any): Boolean
   def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point2D(xc: Int,yc: Int) extends Equal {
   var x: Int = xc
   var y: Int = yc

   def isEqual(obj: Any) = {
     obj.isInstanceOf[Point2D] &&
        obj.asInstanceOf[Point2D].x == x &&
        obj.asInstanceOf[Point2D].y == y
   }
}

object ClassesObjects2 {
  def main(args: Array[String]): Unit = {

     var point1 = new Point2D(10,20)
     var point2 = new Point2D(10,20)
     var point3 = new Point2D(20,20)

     println(point1.isEqual(point2))
     println(point2.isEqual(point3))
     println(point3.isEqual(point1))

     println(point1.isNotEqual(point2))
     println(point2.isNotEqual(point3))
     println(point3.isNotEqual(point1))

  }
}
