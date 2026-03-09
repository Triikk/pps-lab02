package task2

@main
def functionalComposition() : Unit =
  def compose(f: Int => Int, g: Int => Int) : Int => Int =
    x => f(g(x))

  println(compose(_ - 1, _ * 2)(5))

