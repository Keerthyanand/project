package com.annotations

import scala.annotation.StaticAnnotation

class MyAnnotation(x: String) extends StaticAnnotation {
    def hello(): String = { println(x); x }
}

object Annotations1 {

  @MyAnnotation("Hello World!")
  def main(args: Array[String]): Unit = {
     def printannotate(x: String) = ???
     printannotate(main)
  }

}
