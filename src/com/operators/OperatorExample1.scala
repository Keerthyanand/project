package com.operators

import scala.collection.mutable.Map

class MyCollection {

  var map1: Map[String,Int] = Map[String,Int]()

  def += (x: String,y: Int): Unit = {
    map1 += (x -> y)
  }

  def -= (x: String): Unit = {
    map1 -= x
  }

  def apply(key:String): Option[Int] = if(map1.contains(key)) Some(map1(key)) else None

}


object OperatorExample1 {

  def main(args: Array[String]):Unit = {

    var collection1 = new MyCollection()

    collection1 += ("hello",1)
    collection1 += ("world",2)
    collection1 += ("luminar",3)

    println(collection1("hello"))
    println(collection1("world"))
    println(collection1("luminar"))

    collection1 -= "world"

    println(collection1("world").getOrElse("Key Doesnt Exist!"))

  }

}
