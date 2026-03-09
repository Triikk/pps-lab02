package task2

@main
def positive() : Unit =

  def positiveMethod(x : Int) : String = x match
  case n if n >= 0 => "positive"
  case _ => "negative"

  val positiveFunction : Int => String = x => x match
    case n if n >= 0 => "positive"
    case _ => "negative"

  println(positiveMethod(10))
  println(positiveMethod(-10))

  println(positiveFunction(10))
  println(positiveFunction(-10))

