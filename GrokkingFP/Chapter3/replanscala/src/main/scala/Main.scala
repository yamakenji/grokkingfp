@main def hello(): Unit =
  println("Hello world!")
  println(msg)

  val plan = List("Paris", "London", "New York", "San Francisco", "Tokyo")
  val newPlan = replan(plan, "Dubai", "New York")
  println(newPlan.mkString(", "))

def msg = "I was compiled by Scala 3. :)"


def replan(plan: List[String], newCity: String, beforeCity: String): List[String] = {
  val beforeCityIndex = plan.indexOf(beforeCity)
  val citiesBefore = plan.slice(0, beforeCityIndex)
  val citiesAfter = plan.slice(beforeCityIndex, plan.size)
  citiesBefore.appended(newCity).appendedAll(citiesAfter)
}