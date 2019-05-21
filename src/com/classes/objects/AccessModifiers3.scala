package com.classes.objects

class BaseClass2(val i1: Int) {

  protected var i:Int = i1

  protected def print(): Unit = {
    println(s"Base Class ${i}")
  }

  def printf(str:String): Unit = {
    println(s"$str:$i")
  }

  def printfp(str:String): Unit = {
    println(s"$str:$i")
  }

}


class SubClass2 extends BaseClass2(i1=20) {

  def printstr(): Unit = {
    super.print()
  }

  def printstr(str:String): Unit = {
    super.printf(str)
  }

  override def printf(str:String): Unit = {
    println(s"$str -> Subclass i = ${i}")
  }

  override def printfp(str: String):Unit = {
    println(s"Subclass -> $str:$i")
  }

  def get(): Int = {
    i
  }
}


object AccessModifiers3 {

  def main(args: Array[String]): Unit = {
    var base1 = new BaseClass2(1)
    var sub1 = new SubClass2()

    var base2: BaseClass2 = new SubClass2()

    //base1.printf("Value Of i is ")
    sub1.printstr()
    sub1.printstr("Subclass -> Value of i is ")
    println(sub1.get())

    sub1.printf("Overriden : ")
    sub1.printfp("Overriden : ")
    base2.asInstanceOf[SubClass2].printf("As Instance : ")
    sub1.asInstanceOf[BaseClass2].printf("As Instance 2: ")
  }

}

