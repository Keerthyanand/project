package com.problems

import scala.collection.mutable

object ListUnique {

  def main(args: Array[String]): Unit = {

    var list1:List[String] = List[String]("a","b","b","c","c","d","a")
    var list2:mutable.MutableList[String] = mutable.MutableList[String]()

    var prev:String = list1(0)
    var current:String = list1(0)

    list1.foreach((i) => {
       current = i
       if(prev!=current) {
          list2 += current
       } else if(list2.length == 0) {
          list2 += current
       }
       prev = current
    })

    println(list2)

  }

}
