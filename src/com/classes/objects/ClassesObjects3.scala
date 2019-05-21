package com.classes.objects

trait Log {

  def log(date:String, message: String): Unit

  def logDifferentDate(message: String) = () => log(_:String,message)

  def logSameDate(date:String) = () => log(date,_:String)

  def endDateLog() = () => log("31-12-2019",_:String)

}

class Logger(logType: String) extends Log {

  var logtype: String = logType

  override def log(date: String, message: String): Unit = {

     println(s"[${logtype}]:$date = $message")

  }

}

object ClassesObjects3 {

  def main(args: Array[String]): Unit = {

    var logger = new Logger("INFO")
    var logger2 = new Logger("WARN")
    var logger3 = new Logger("ERROR")

    logger.log("01-01-2019","This is Logger 1")
    logger2.log("01-01-2019","This is Logger 2")
    logger3.log("01-01-2019","This is Logger 3")

    val log1 = logger.logSameDate("01-01-2019")()
    val log2 = logger.logDifferentDate("Hello World!")()
    val log3 = logger.endDateLog()()

    val log4 = logger2.logSameDate("01-01-2019")()
    val log5 = logger2.logDifferentDate("Hello World!")()
    val log6 = logger2.endDateLog()()

    val log7 = logger3.logSameDate("01-01-2019")()
    val log8 = logger3.logDifferentDate("Hello World!")()
    val log9 = logger3.endDateLog()()

    //    goodMorningLogger("Good Morning!")
    log1("Hello World!")
    log1("Hello World!")
    log1("Hello World!")
    log1("Hello World!")

    log2("02-01-2019")
    log2("02-01-2019")
    log2("02-01-2019")
    log2("02-01-2019")
    log2("02-01-2019")

    log3("End Of Date!")
    log3("End Of Date!")
    log3("End Of Date!")
    log3("End Of Date!")

    log4("Hello World!")
    log4("Hello World!")
    log4("Hello World!")
    log4("Hello World!")

    log5("02-01-2019")
    log5("02-01-2019")
    log5("02-01-2019")
    log5("02-01-2019")
    log5("02-01-2019")

    log6("End Of Date!")
    log6("End Of Date!")
    log6("End Of Date!")
    log6("End Of Date!")

    log7("Hello World!")
    log7("Hello World!")
    log7("Hello World!")
    log7("Hello World!")

    log8("02-01-2019")
    log8("02-01-2019")
    log8("02-01-2019")
    log8("02-01-2019")
    log8("02-01-2019")

    log9("End Of Date!")
    log9("End Of Date!")
    log9("End Of Date!")
    log9("End Of Date!")


    //    log2()

  }

}
