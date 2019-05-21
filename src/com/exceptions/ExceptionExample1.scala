package com.exceptions

object ExceptionExample1 {

  def main(args: Array[String]) = {
    try {
      println(s"args(0) = ${args(0)}")
      println(s"args(1) = ${args(1)}")

      println(s"${args(0)} + ${args(1)} = ${args(0).toInt+args(1).toInt}")

    } catch {
      case ex: ArrayIndexOutOfBoundsException => {
         println(s"Provided ${ex.getMessage()} Arguments!")
         println("Please Provide 2 Arguments!")
      }
      case ex: NumberFormatException => {
         println("Please Provide Numbers")
      }
    }
  }

}
