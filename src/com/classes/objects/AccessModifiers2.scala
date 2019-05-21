package com.classes.objects

class BaseClass(val i1: Int) {

    protected var i:Int = i1

    protected def print(): Unit = {
       println(s"Base Class ${i}")
    }

    def printf(str:String): Unit = {
       println(s"$str:$i")
    }


}


class SubClass extends BaseClass(i1=20) {

    def printstr(): Unit = {
       super.print()
    }

    def printstr(str:String): Unit = {
       super.printf(str)
    }

    def get(): Int = {
      i
    }
}

object AccessModifiers2 {

  def main(args: Array[String]): Unit = {
    var base1 = new BaseClass(1)
    var sub1 = new SubClass()

    var base2: BaseClass = new SubClass()

    base1.printf("Value Of i is ")
//    base1.print()
    sub1.printstr()
    sub1.printstr("Subclass -> Value of i is ")
    println(sub1.get())

    println(base2.asInstanceOf[SubClass].get())
    sub1.asInstanceOf[BaseClass].printf("hello")
//    println(base1.asInstanceOf[SubClass].get())
  }
}
