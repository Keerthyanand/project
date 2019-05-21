package com.problems

import scala.collection.mutable

object SublistVowels {

  def main(args: Array[String]): Unit = {

    var list1:List[String] = List[String]("about","everything","all","nothing","index","urban","google")

    var list2:mutable.MutableList[mutable.MutableList[String]]
            = mutable.MutableList[mutable.MutableList[String]]()

    var index = 0

    list2 = mutable.MutableList.fill[mutable.MutableList[String]](5)(mutable.MutableList[String]())

    list1.map((w) =>
          w.toCharArray.filter((c) =>
            c=='a' || c=='e' || c=='i' || c=='o' || c=='u').mkString
    ).map((w) => {
      var queue1:mutable.Queue[Char]  = mutable.Queue[Char]()

      for(c <- w.toCharArray) {
        queue1.enqueue(c)
      }

      var c = queue1.dequeue()


      var vowel:Int = c match {
        case 'a' => 0
        case 'e' => 1
        case 'i' => 2
        case 'o' => 3
        case 'u' => 4
      }

      (w,vowel)
    })
    .foreach((i) => {
      list2(i._2) += list1(index)
      index += 1
    })

    println(list2)
  }

}
