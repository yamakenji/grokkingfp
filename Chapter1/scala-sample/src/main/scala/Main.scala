object Main extends App {
  println("Hello, World!")

  println(increment(1))
  println(getFirstCharacter("Hello"))
  println(wordScore("Hello"))

  def increment(x: Int): Int = x + 1

  def getFirstCharacter(str: String): Char = str.charAt(0)

  def wordScore(word: String): Int = word.length
}


