package helper {
  import java.util.Calendar
  import java.util.Date
  
  class DateHelper (val number: Int) {

    // def days(when: String): Date = {
    //   var date = Calendar.getInstance()
    //   when match {
    //     case DateHelper.ago => date.add(Calendar.DAY_OF_MONTH, -number)
    //     case DateHelper.from_now => date.add(Calendar.DAY_OF_MONTH, number)
    //     case _ => date
    //   }
    //   date.getTime()
    // }

    def days = new FromHelper(this)
  }

  class FromHelper (val date:DateHelper) {
    def from = new NowHelper(this)
  }

  class NowHelper (from:FromHelper) {
    def now = {
      var date = Calendar.getInstance()
      date.add(Calendar.DAY_OF_MONTH, from.date.number)
      date.getTime()
    }
  }

  object DateHelper {
    val ago = "ago"
    val from_now = "from_now"
    val fuck = "fuck"
    implicit def convertInt2Date(number: Int) = new DateHelper(number)
    //implicit def convertDate2FromHelper(date: Date) = new FromHelper(date)
  }
}

