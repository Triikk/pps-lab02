package task2

@main
def neg() : Unit =
  val neg : (String => Boolean) => (String => Boolean) = pred => x => !pred(x)

  def negMethod(pred : String => Boolean) : String => Boolean = x => !pred(x)

  val empty: String => Boolean = _ == "" // predicate on strings
  val notEmpty = neg(empty) // which type of notEmpty?
  println(notEmpty("foo")) // true
  println(notEmpty("")) // false
  println(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test

  val notEmptyMethod = negMethod(empty)
  println(notEmptyMethod("foo"))
  println(notEmptyMethod(""))
  println(notEmptyMethod("foo") && !notEmptyMethod(""))