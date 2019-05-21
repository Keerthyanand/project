package com.fileio

import java.io._

object FileIOExample1 {

  def main(args: Array[String]) = {

     var pw = new PrintWriter("hello.txt")

     pw.println("This is line1")
     pw.println("This is line2")
     pw.flush()

     pw.close()

  }

}
