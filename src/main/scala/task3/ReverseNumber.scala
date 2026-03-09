package task3

@main
def reverseNumber() : Unit =
  def reverseNumber(n : Int) : Int =
    @annotation.tailrec
    def _reverse(n : Int, acc : Int) : Int = n match
      case n if n == 0 => acc
      case _ => _reverse(n / 10, acc * 10 + n % 10)
    _reverse(n, 0)

  println(reverseNumber(12345))
  println(reverseNumber(13335))
