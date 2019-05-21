package com.scala

class MyScalaInterop1 {

  def getMessage(x: Int,y: Int): String = {
    s"x= $x, y = $y, sum = ${x+y}"
  }

}
