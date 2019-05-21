import java.util.Scanner

object JavaInterop1 {

  def main(args: Array[String]): Unit = {

    var sc: Scanner = new Scanner(System.in)

    sc.useDelimiter("\n")

    println("Input A String : ")
    println("You Typed : "+sc.next())

  }
}
