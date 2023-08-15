@main def pureFunction: Unit =
  val justApple = List("Apple")
  println(ShopingCart.getDiscountPercentage(justApple))
  val appleAndBook = List("Apple", "Book")
  println(ShopingCart.getDiscountPercentage(appleAndBook))

  println(TipCalculator.getTipPercantage(List.empty))
  val smallGroup = List("Alice", "Bob", "Charlie")
  println(TipCalculator.getTipPercantage(smallGroup))
  val largeGroup = List("Alice", "Bob", "Charlie","Daniel", "Emily", "Frank")
  println(TipCalculator.getTipPercantage(largeGroup))

  // Test
  println(ShopingCart.getDiscountPercentage(List.empty) == 1)
  println(ShopingCart.getDiscountPercentage(List.empty) == 0)
  println(ShopingCart.getDiscountPercentage(List("Apple", "Book")) == 5)

  println(increment(6) == 7)
  println(increment(0) == 1)
  println(increment(-6) == -5)
  println(increment(Integer.MAX_VALUE - 1) == Integer.MAX_VALUE)
  println(add(2, 5) == 7)
  println(add(-2, 5) == 3)
  println(wordScore("Scala") == 3)
  println(wordScore("Functional") == 8)
  println(wordScore("") == 0)
  println(TipCalculator.getTipPercantage(List("Alice", "Bob")) == 10)
  println(TipCalculator.getTipPercantage(List("Alice", "Bob", "Charlie", "Danny", "Emily", "Wojtek")) == 2)
  println(TipCalculator.getTipPercantage(List.empty) == 0)
  println(getFirstCharacter("Ola") == 'O')
  println(getFirstCharacter("") == ' ')
  println(getFirstCharacter(" Ha! ") == ' ')

def increment(x: Int): Int = x + 1
def add(a: Int, b: Int): Int = a + b
def wordScore(word: String): Int = {
  word.replaceAll("a", "").length
}
def getFirstCharacter(s: String): Char = {
  if (s.length > 0) s.charAt(0)
  else ' '
}

object ShopingCart {
  def getDiscountPercentage(items: List[String]): Int = {
    if (items.contains("Book")) {
      5
     } else {
        0
      }
    }
  }

  object TipCalculator {
    def getTipPercantage(names: List[String]): Int = {
      if (names.size > 5) 20
      else if (names.size > 0) 10
      else return 0
    }
  }
  
