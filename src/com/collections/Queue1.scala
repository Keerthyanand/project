package com.collections

import scala.collection.mutable.Queue

object Queue1 {

  def main(args: Array[String]): Unit = {

    var queue1: Queue[Int] = Queue[Int]()

    queue1.enqueue(1)
    queue1.enqueue(2)
    queue1.enqueue(3)
    queue1.enqueue(4)
    queue1.enqueue(5)
    queue1.enqueue(6)
    queue1.enqueue(7)
    queue1.enqueue(8)

    for(q <- queue1) {
      println(q)
    }

    println(s"Queue Size => ${queue1.size}")

    println(queue1.dequeue())
    println(queue1.dequeue())
    println(queue1.dequeue())
    println(queue1.dequeue())
    println(queue1.dequeue())

    println(s"Queue Size => ${queue1.size}")

    println(queue1.dequeueFirst((i) => i >= 7).getOrElse("7 is not in the queue!"))

    for(q <- queue1) {
      println(q)
    }

    queue1.map(i => "Value : "+i).foreach {
      println
    }

    queue1.reverse.foreach {
      println
    }

    println(queue1)

    var queue2 = Queue[Int](1,2,3,5,6,7,8)

    var tqs = queue2.span((i) => queue2(i)%2==0 )

    println(tqs._1)
    println(tqs._2)

//    queue1.span((i) => i%2==0)._1.foreach {
//      println
//    }
//
//    println(queue1.span((i) => i%2==1)._1)
//    println(queue1.span((i) => i%2==1)._2)


  }

}
