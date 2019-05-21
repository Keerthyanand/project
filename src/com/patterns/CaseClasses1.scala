package com.patterns

object CaseClasses1 {

  def main(args: Array[String]) = {

    println(matchnumbers(1))
    println(matchnumbers(2))
    println(matchnumbers(3))

  }

  def matchnumbers(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "any"
  }

}
