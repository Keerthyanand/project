package com.implicitclasses

import scala.io.Source

object Utils {

  implicit class IsOddEven(x: Int) {
    def isOdd: Boolean = x%2==1
    def isEven: Boolean = !isOdd
  }

  implicit class Strings(str: String) {
    def words: Array[String] = str.split(" ")
    def letters: Array[Char] = str.toCharArray()
    def numbers: Array[Int] = letters.filter((l)=>l.isDigit).map((l)=>""+l).map((d)=>d.toInt)
  }

  implicit class WordCount(s: Source) {

    def wordcount: Array[(String,Int)] = {

//      import scala.collection.mutable.Map
//
//      var map1: Map[String,Int] = Map[String,Int]()
//
//      s.getLines()
//        .flatMap((l) => l.split(" "))
//        .map((w) => (w,1))
//        .foreach(t1 => {
//           if(map1.contains(t1._1)) {
//             map1(t1._1) = map1(t1._1) + 1
//           } else {
//             map1(t1._1) = t1._2
//           }
//        })

      s.getLines()
        .flatMap((l) => l.split(" "))
          .toArray.groupBy(w => w)
          .map((t1) => (t1._1, t1._2.length))
          .toArray
    }

  }

}

import Utils._

import scala.io.Source

object ImplicitClasses1 {

  def main(args: Array[String]): Unit = {
    var i = 2
//      map1.toArray
    println(i.isOdd)
    println(i.isEven)

    println(i isOdd)
    println(i isEven)

    var s: String = "Hello World!"

    println(s"Words in ${s}")
    s.words.foreach((w)=>println(w))

    println(s"Letters in ${s}")
    s.letters.foreach((l)=>println(l))

    s = "Hello 123 World!"
    println(s"Numbers in ${s}")
    s.numbers.foreach((n)=>println(n))

    Source.fromFile("hello.txt").wordcount.foreach(wt=>{
      println(wt._1+"="+wt._2)
    })

    Source.fromString("This is line1\nThis is line2").wordcount.foreach(wt=>{
      println(wt._1+"="+wt._2)
    })

  }

}
