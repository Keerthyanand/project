package com.problems

import scala.collection.mutable.MutableList
import Array._

object RunLengthEncoding {

  def main(args:Array[String]): Unit = {

    var list1:MutableList[String] = MutableList[String]("a","a","a","b","b","c","c","c","a","a","c")

    var list2:MutableList[Array[String]] = MutableList[Array[String]]()

    var prev:String = list1(0)
    var current:String = list1(0)

    var index:Int = 0

    //a
    //list2 -> A(a,"1")
    //index -> 0
    //a,a
    //list2 -> A(a,"1")
    //index -> 0
    //list2(index) -> A(a,"2")
    //list2 -> (A(a,"3"))
    //prev -> a
    //current -> b
    //list2 -> (A(a,"3"),A(b,"1"))
    list1.foreach((w) => {
      current = w

      if(prev==current) {
         if(list2.length == 0) {
            list2 += Array[String](current,"1")
         } else if(list2.length > index) {
            list2(index)(1) = ""+ (list2(index)(1).toInt + 1)
         } else {
            list2 += Array[String](current,"1")
         }
       } else {
         index += 1
         list2 += Array[String](current,"1")
       }

       prev = current
    })

    var list3: MutableList[(String,Int)] = MutableList[(String,Int)]()

    list3 = list2.map(i => (i(0),i(1).toInt))

    println(list3)

//    list2.map(i => i.mkString(":"))
//      .reduce((a,b) => a+","+b)
//      .foreach {
//        print
//      }


  }

}
