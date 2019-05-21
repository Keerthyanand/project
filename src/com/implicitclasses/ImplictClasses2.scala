package com.implicitclasses

object ImplicitObjects {

    implicit class Times(x: Int) {

      def times [A](f: => A): Unit = {

          def loop(current: Int): Unit = {

            if(current>0) {
              f
              loop(current-1)
            }

          }

          loop(x)
      }


    }

}

import com.implicitclasses.ImplicitObjects._

object ImplictClasses2 {

  def main(args: Array[String]): Unit = {
      4 times println("hello")
  }

}
