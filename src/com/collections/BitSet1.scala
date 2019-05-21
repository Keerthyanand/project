package com.collections

import scala.collection.mutable.BitSet

object BitSet1 {

  def main(args: Array[String]): Unit = {
    var bitSet1: BitSet = BitSet(0,1,3,5,7)
    var bitSet2: BitSet = BitSet(0,1,2,3)
    var bitSet3: BitSet = BitSet(0,1,3,5,7)

    for(i <- 0 until 9) {
      println(s"Element $i : ${bitSet1(i)}")
    }

    bitSet1 &= bitSet2

    for(i <- 0 until 8) {
      println(s"Element $i : ${bitSet1(i)}")
    }

    bitSet1 |= bitSet2

    for(i <- 0 until 8) {
      println(s"Element $i : ${bitSet1(i)}")
    }

    println(s"$bitSet1 &~ $bitSet3 = ${bitSet1 &~ bitSet3}")
    println(s"$bitSet1 &~ $bitSet3 = ${bitSet3 &~ bitSet1}")

  }
}
