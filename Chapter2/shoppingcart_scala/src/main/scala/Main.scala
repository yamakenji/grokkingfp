@main def hello(): Unit = {
  val justApple = List("Apple")
  println(ShoppingCart.getDiscountPercentage(justApple))

  val appleAndBook = List("Apple", "Book")
  println(ShoppingCart.getDiscountPercentage(appleAndBook))

  println(TipCalculator.getTipPercentage(List.empty))

  val smallGroup = List("Alice", "Bob", "Charlie")
  println(TipCalculator.getTipPercentage(smallGroup))

  val largeGroup = List("Alice", "Bob", "Charlie", "David", "Eve", "Frank")
  println(TipCalculator.getTipPercentage(largeGroup))

  // 2.20
  println(ShoppingCart.getDiscountPercentage(List.empty) == 1)
  println(ShoppingCart.getDiscountPercentage(List.empty) == 0)
  println(ShoppingCart.getDiscountPercentage(List("Apple","Book")) == 5)

  // 2.22

  println("----- increment -----")
  def increment(x: Int): Int = {
    x + 1
  }
  //test
  println(increment(6) == 7)
  println(increment(0) == 1)
  println(increment(-6) == -5)
  println(increment(Integer.MAX_VALUE - 1) == Integer.MAX_VALUE)

  println("----- add -----")
  def add(a: Int, b: Int): Int = {
    a + b
  }
  println(add(1, 2) == 3)
  println(add(0, 0) == 0)
  println(add(-2, 5) == 3)

  println("----- wordScore -----")
  def wordScore(word: String): Int = {
    word.replace("a", "").length()
  }
  println(wordScore("apple") == 4)
  println(wordScore("Scala") == 3)
  println(wordScore("function") == 8)
  println(wordScore("") == 0)

  println("----- getFirstCharacter -----")
  def getFirstCharacter(s: String): Char = {
    if (s.length > 0) s.charAt(0)
    else ' '
  }

  println(getFirstCharacter("apple") == 'a')
  println(getFirstCharacter("Ola") == 'O')
  println(getFirstCharacter("") == ' ')
  println(getFirstCharacter(" Ha! ") == ' ')
}

object ShoppingCart {
  def getDiscountPercentage(items: List[String]): Int = {
    if (items.contains("Book")) {
      5
    } else {
      0
    }
  }
}

object TipCalculator {
  def getTipPercentage(names: List[String]): Int = {
    if (names.size > 5) {
      20
    } else if (names.size > 0) {
      10
    } else {
      0
    }
  }
}
