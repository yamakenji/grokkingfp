@main def hello(): Unit =
  println("Hello world!")
  println(msg)
  println(increment(6))
  println(getFirstCharacter("Hello"))
  println(wordScore("Goodbye"))


def msg = "I was compiled by Scala 3. :)"

def increment(x: Int): Int = {
  x + 1
}

def getFirstCharacter(s: String): Char = {
  s.charAt(0)
}

def wordScore(word: String): Int = {
  word.length()
}