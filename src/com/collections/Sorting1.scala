package com.collections

class Person1(n: String) {
  var name: String = n

  override def toString: String = name
}

//[@542f

class Person2(n: String) extends Ordered[Person2] {
  var name: String = n

  override def toString: String = name

  override def compare(that: Person2): Int = if (name > that.name) 1 else -1
//  override def compare(that: Person2): Int = name.compareTo(that.name)
}

object Sorter {

  implicit class Sorters[T](x: List[T]) {

     def sortedWith(f: (T,T) => Boolean):List[T] = {
       x.sortWith(f)
     }

  }

}

import Sorter._

object Sorting1 {

  def main(args: Array[String]): Unit = {

     var list1:List[Int] = List[Int](1,3,2,4,6,5,9,8,7)

     val list2 = list1.sorted

     println(list2)

     var list3 = list1.sortWith((t1,t2) => t1 > t2)

     println(list3)

     list3 = list1.sortWith(_ > _)

     println(list3)

     var list4 = list1.sortWith(_<_)

     println(list4)

     def sorter(a: Int,b: Int) = {
       a < b
     }

     println(list1.sortWith(sorter))

     var list5 = List[Person1](
                      new Person1("Santhosh"),
                      new Person1("Chandramouliswaran"),
                      new Person1("Rahul")
                    )

     //println(list5.sorted)

     println(list5.sortWith(_.name > _.name))

     var list6 = List[Person2](
                         new Person2("Santhosh"),
                         new Person2("Chandramouliswaran"),
                         new Person2("Rahul")
                       )

     println(list6.sorted)

     println(list5.sortedWith((p1,p2) => p1.name > p2.name))

  }

}
