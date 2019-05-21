package com.extractors

object ExtractorExample1 {
  
  def main(args: Array[String]) = {

      var ex1 = ExtractorExample1(10)

      println(ex1)

      ex1 match {
        case ExtractorExample1(num) => println(s"$ex1 is two times than $num")
        case _ => println("No Value!")
      }

  }

  def apply(x: Int) = x*2

  def unapply(x: Int): Option[Int] = if (x%2==0) Some(x/2) else None
  
}
