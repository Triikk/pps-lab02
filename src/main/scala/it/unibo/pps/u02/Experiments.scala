package it.unibo.pps.u02

@main
def experiments() : Unit =
  val divide : (Double, Double) => Double = (x,y) => x/y

  val carriedDivideAsFunction : Double => Double => Double = x => y => x/y

  def carriedDivide(x : Double)(y : Double) : Double = x/y

  println(carriedDivideAsFunction(20)(4))
  println(carriedDivide(10)(5))

  val compositionAsFunction : (Double => Double, Double) => Double = (g, x) => g(x)

  println(compositionAsFunction(x => 2*x, 30))

  def composition(g : Double => Double)(x : Double) : Double = g(x)

  val twice : Double => Double = composition(x => 2*x);
  println(twice(100))