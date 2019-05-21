package com.classes.objects

//public,protected,private

class PrivateMembers {

    private var i:Int = 1

    private def function(): Unit = {
       println(s"i = ${i}")
    }

    def function2(): Unit = {
      function()
    }

}

object AccessModifiers1 {

  def main(args: Array[String]) = {

     var obj: PrivateMembers = new PrivateMembers()

//     obj.i
     obj.function2()
//     obj.function()

  }

}
