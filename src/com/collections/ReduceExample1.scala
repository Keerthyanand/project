package com.collections


object ReduceExample1 {

  def main(args: Array[String]): Unit = {

    var list1:List[Int] = List[Int](1,2,3,4,5,6,7,8,9)

    var list2:List[Int] = List[Int]()

    var summed:Int = list1.reduce((a,b) => a+b)
    println(s"Summed Value : $summed")

    var allValues:String = list1.map(i => i.toString).reduce((a,b) => a+","+b)
    println(s"All Values : $allValues")

    var sumOption: Option[Int] = list2.reduceOption((a,b) => a+b)
    println(s"Summed Value : ${sumOption.getOrElse("List Empty!")}")

    var list3:List[String] = List[String]("This is a line",
      "This is next line",
      "Another line")

       //This,List(This,This)
//      var wordCounts:String =
      list3.flatMap((l)=> l.split(" "))
      .groupBy(t1=>t1)
      .map(t1 => t1._1.toString + ":" + t1._2.length.toString)
      .map(a => a.split(":")(0)+"="+a.split(":")(1))
      .reduce((a,b) => s"${a}\n${b}")
      .foreach {
        print
      }

//      println(wordCounts)
  }

}
