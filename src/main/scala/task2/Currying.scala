package task2

@main
def currying() : Unit =
  val x1=3
  val x2=5
  val y=2
  val z=2

  val p1 : Int => Int => Int => Boolean = x => y => z => x<=y+z
  println(p1(x1)(y)(z))
  println(p1(x2)(y)(z))

  val p2 : (Int, Int, Int) => Boolean = (x,y,z) => x<=y+z
  println(p2(x1,y,z))
  println(p2(x2,y,z))

  def p3(x : Int)(y: Int)(z: Int) : Boolean = x<=y+z
  println(p3(x1)(y)(z))
  println(p3(x2)(y)(z))

  def p4(x: Int, y: Int, z: Int) : Boolean = x<=y+z
  println(p4(x1,y,z))
  println(p4(x2,y,z))