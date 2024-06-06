@main def hello(): Unit =
  println("Hello world!")
  println(msg)

  val name = "John Doe"
  println(abbreviate(name))


def msg = "I was compiled by Scala 3. :)"

def abbreviate(name: String): String = {
  val initial = name.substring(0, 1)
  val separator = name.indexOf(' ')
  val lastName = name.substring(separator + 1)
  initial + ". " + lastName
}