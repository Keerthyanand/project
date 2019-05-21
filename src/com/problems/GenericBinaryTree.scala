package com.problems

object MyBinaryTree {

  implicit class Times(x: Int) {
     def times[A] (f: => A) = {
       for(i <- 0 until x) {
         f
       }
     }
  }

  class Node[T](left1:Option[Node[T]] = None,right1:Option[Node[T]] = None,v: T = None) {

    var left: Option[Node[T]] = left1
    var right: Option[Node[T]] = right1

    var value: T = v

    def get(): T = value

    def set(v: T) = value = v

    def getLeft(): Node[T] = {
      left.get
    }

    def getRight(): Node[T] = {
      right.get
    }

    override def toString: String = value.toString

    def display(sep:Char = '\t',node:Char = '|',depth:Int = 0): Unit = {
      depth times print(sep)
      println(get())
      depth times print(sep)
      print(node)

      if(!left.isEmpty) {
        print("-[left]-")
        left.get.display(sep, node, depth+1)
      } else {
        println("-[left]-[empty]-")
      }

      depth times print(sep)
      print(node)

      if(!right.isEmpty) {
        print("-[right]-")
        right.get.display(sep, node, depth+1)
      } else {
        println("-[right]-[empty]-")
      }
    }

    def += (node: Node[T]): Option[Node[T]] = {

      if(left.isEmpty) {
        left = Some[Node[T]](node)
        return left
      } else if(right.isEmpty) {
        right = Some[Node[T]](node)
        return right
      }

      None
    }

    def -= (node: Node[T]): Option[Node[T]] = {

      if(!left.isEmpty && left.get==node) {
        left = None
        return Some(this)
      } else if(right.isEmpty && right.get==node) {
        right = None
        return Some(this)
      }

      None
    }

    def += (v: T): Option[Node[T]] = {

      if(left.isEmpty) {
        left = Some(new Node[T](None,None,v))
        return left
      } else if(right.isEmpty) {
        right = Some(new Node[T](None,None,v))
        return right
      }

      None
    }

    def -= (v: T): Option[Node[T]] = {

      if(!left.isEmpty && left.get.value==v) {
        left = None
        return Some(this)
      } else if(!right.isEmpty && right.get.value==v) {
        right = None
        return Some(this)
      }

      None
    }

  }

  class Tree[T](root1: Node[T]) {

    var root: Node[T] = root1

    def getRoot(): Node[T] = root

    def setRoot(root1: Node[T]) = root = root1

    def display() = {
      println("-[root]-")
      root.display()
    }

  }

}

object GenericBinaryTree {

  def main(args: Array[String]): Unit = {

    import MyBinaryTree._

    var root: MyBinaryTree.Node[Int] = new MyBinaryTree.Node[Int](None,None,1)

    var tree1: MyBinaryTree.Tree[Int] = new MyBinaryTree.Tree[Int](root)

    root += 2
    root += 3

    println(root.left)
    println(root.right)

    root.getLeft() += 4
    root.getLeft() += 5

    println(root.getLeft().left)
    println(root.getLeft().right)

    root.getRight() += 6
    root.getRight() += 7

    tree1.display()

  }

}
