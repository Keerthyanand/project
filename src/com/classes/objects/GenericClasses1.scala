package com.classes.objects

//List[Int]
//Map[String,Int]

class Class1[A](x1: A) {

  var x: A = x1

  def getValue(): A = {
    x
  }

  def setValue(x1: A) = {
    x = x1
  }

}

class Class2[A,B](x1: A) {

   var x:A = x1

   def map(f: A => B): B = {
      f(x1)
   }

}


object GenericClasses1 {

  def main(args: Array[String]): Unit = {

    var class1: Class1[Int] = new Class1[Int](10)

    class1.setValue(20)

    println(class1.getValue())

    var class2: Class2[Int,String] = new Class2[Int,String](10)

    println(class2.map((x) => "X is "+x.toString))

    var class3: Class2[String,Int] = new Class2[String,Int](x1="10")

    println(class3.map((x) => x.toInt))

  }

}

//class Collection[A] {
//  var set1: Set[A] = Set[A]()
//
//  def add(x: A) = {
//    set1 += x
//  }
//
//  def remove(x: A) = {
//    set1 -= x
//  }
//
//  def reduce(f: (A,A) => A) = {
//    for(i <- 0 until set1.size by 2) {
//      f(i,i+1)
//    }
//
//  }
//}
