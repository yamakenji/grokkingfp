@main def hello(): Unit =
  println("Hello world!")
  println(msg)

  val firstName = "Kenji"
  val lastName = "Yamauchi"
  println(firstName + " " + lastName)

  val a: Int = 1
  val b: Int = 1
  if a == b then println("a == b")

def msg = "I was compiled by Scala 3. :)"


