@main def hello(): Unit =
  println("Hello world!")
  println(msg)

  val firstName = "Kenji"
  val lastName = "Yamauchi"
  println(firstName + " " + lastName)

  val a = 105
  val b = 10
  println(min(a, b))
  
  val t = (1, "Yo")
  println(t)
  

def msg = "I was compiled by Scala 3. :)"

def min(a: Int, b: Int): Int =
  if a < b then a else b

