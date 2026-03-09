package task3

@main
def recursivePower() : Unit =
  def power(base : Double, exponent : Int) : Double = exponent match
    case e if e == 0 => 1
    case _ => base * power(base, exponent-1)

  println(power(5,0))
  println(power(5,2))

  def powerTailRec(base : Double, exponent : Int): Double =
    @annotation.tailrec
    def _power(base: Double, exponent : Int, acc : Double) : Double = exponent match
      case e if e == 0 => acc
      case _ => _power(base, exponent-1, acc*base)
    _power(base, exponent, 1)

  println(powerTailRec(5,0))
  println (powerTailRec(5,2))
