@main def hello(): Unit =
  println("Hello world!")
  println(msg)

  val list = List("a", "b", "c", "d", "e")
  println(list.size)
  println(firstTwo(list))
  println(lastTwo(list))
  println(moveFirstTwoToTheEnd(list))
  println(insertedBeforeLast(list, "z"))
  
def msg = "I was compiled by Scala 3. :)"

def firstTwo(list: List[String]): List[String] = list.slice(0, 2)

def lastTwo(list: List[String]): List[String] = list.slice(list.size - 2, list.size)

def moveFirstTwoToTheEnd(list:  List[String]): List[String] = {
  val firstTwo = list.slice(0, 2)
  val withoutFirstTwo = list.slice(2, list.size)
  withoutFirstTwo.appendedAll(firstTwo)
}

def insertedBeforeLast(list: List[String], element: String): List[String] = {
  val last = list.slice(list.size - 1, list.size)
  val withoutLast = list.slice(0, list.size - 1)
  withoutLast.appended(element).appendedAll(last)
}
