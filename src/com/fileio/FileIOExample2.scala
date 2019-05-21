package com.fileio

import scala.io.Source

import scala.collection.mutable.Map

object FileIOExample2 {

  def main(args: Array[String]) = {

     Source.fromFile("hello.txt").foreach {
       print
     }

    println()

    Source.fromFile("hello.txt").getLines().foreach {
      println
    }

    println()

    Source.fromFile("hello.txt").bufferedReader().lines().forEach {
      println
    }


    var map1: Map[String,Int] = Map[String,Int]()

    Source.fromFile("hello.txt").getLines()
        .flatMap((line) => line.split(" "))
      .map((word) => (word,1))
      .foreach((t1) => {

        if(map1.contains(t1._1)) {
//          var v = map1(t1._1)
//
//          v += 1

          map1(t1._1) = map1(t1._1)+1

//          map1 += (t1._1 -> v)

        } else {
          map1(t1._1) = t1._2
        }

      })

    map1.map(kv => kv._1+"="+kv._2).foreach((v) => println(v))


  }

}
