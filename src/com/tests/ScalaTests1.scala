package com.tests

import org.scalatest.Assertions._

object ScalaTests1 {

  def main(args: Array[String]): Unit = {
      var value1 = 1
      var value2 = 2

      var s = "hi"

//    assert(value1 == value2)
//    fail("This line is failed!")
//    cancel("This line is canceld!")
      var inter1 = intercept[IndexOutOfBoundsException] {
         s.charAt(2)
      }

      println(inter1)
      println(inter1.getMessage)
      assert(inter1.getMessage.indexOf("2") != -1)
//
//    assertCompiles("val a: Int = 0")
//    assertCompiles("val a: = 0")
//    assertDoesNotCompile("val a: Int = 0")

    assertTypeError("val a: String = \"\"")
  }

}
