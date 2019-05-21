package com.patterns

case class Employee(n: String, a: Int, d: String) {

  var name:String = n
  var age:Int = a
  var dept: String = d

  def print(): String = {
    s"$name is $age of age!"
  }

}

object CaseClasses2 {
  def main(args: Array[String]): Unit = {
//    var map1 =  Map[String,String]("Santhosh" -> "IT",
//      "Rahul" -> "HR",
//      "Anoop" -> "HR",
//      "Shijas" -> "IT")
//
//    var person1 = new Employee("Santhosh",38)
//    var person2 = new Employee("Rahul",42)
//    var person3 = new Employee("Anoop",40)
//    var person4 = new Employee("Shijas",40)
//
//    for(person <- List(person1,person2,person3,person4)) {
//      person match {
//        case Employee("Santhosh",38) => println(s"Hi ${map1(person.name)} Faculty and you are ${person.print()}");
//        case Employee("Shijas",40) => println(s"Hi ${map1(person.name)} Faculty and you are ${person.print()}");
//        case _ => println(s"Hi ${map1(person.name)} Recruiter and you are ${person.print()}")
//      }
//    }
//
//    for(person <- List(person1,person2,person3,person4)) {
//
//      person match {
//        case Employee("Santhosh", _) => println(s"Hi ${map1(person.name)} Faculty and you are ${person.print()}");
//        case Employee("Shijas", _) => println(s"Hi ${map1(person.name)} Faculty and you are ${person.print()}");
//        case _ => println(s"Hi ${map1(person.name)} Recruiter and you are ${person.print()}")
//      }
//
//    }

    var person1 = new Employee("Santhosh",38,"IT")
    var person2 = new Employee("Rahul",42,"HR")
    var person3 = new Employee("Anoop",40,"HR")
    var person4 = new Employee("Shijas",40,"IT")
    var person5 = new Employee("Celeine",25,"Staffs")
    var person6 = new Employee("Albin",25,"Students")

    for(person <- List(person1,person2,person3,person4,person5,person6)) {
      person match {
        case Employee(_,_,"IT") => println(s"Hi ${person.dept} Faculty and you are ${person.print()}");
        case Employee(_,_,"HR") => println(s"Hi ${person.dept} Recruiter and you are ${person.print()}");
        case _ => println(s"Hi ${person.name} Is In ${person.dept}")
      }
    }

  }


}
