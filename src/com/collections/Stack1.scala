package com.collections

import scala.collection.mutable.Stack

object Stack1 {
  def main(args: Array[String]): Unit = {
     var stack1: Stack[Int] = Stack[Int]()

    stack1.push(1)
    stack1.push(2)
    stack1.push(3)
    stack1.push(4)
    stack1.push(5)

    println(stack1.pop())
    println(stack1.top)
    println(stack1.top)




  }
}
