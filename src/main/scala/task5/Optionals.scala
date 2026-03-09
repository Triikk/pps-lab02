package task5

// overall module
object Optionals:

  // type "public" definition, exposing structure
  enum OptionalInt:
    case Just(value: Int)
    case Empty()

  // operations (/algorithms)
  object OptionalInt:

    def isEmpty(opt: OptionalInt): Boolean = opt match
      case Empty() => true
      case _       => false

    def orElse(opt: OptionalInt, orElse: Int): Int = opt match
      case Just(a) => a
      case _       => orElse

    def mapInt(x : OptionalInt)(map : Int => Int) : OptionalInt = x match {
      case Just(n) => Just(map(n))
      case _ => x
    }

    def filter(x : OptionalInt)(pred : Int => Boolean) : OptionalInt = x match {
      case Just(n) if pred(n) => x
      case _ => Empty()
    }

@main def tryOptionals(): Unit =
  import Optionals.* // to work with Optionals (to see OptionalInt type)
  import OptionalInt.* // to directly access algorithms

  val s1: OptionalInt = Just(1)
  val s2: OptionalInt = Empty()

  println(s1) // Just(1)
  println(isEmpty(s1)) // false
  println(orElse(s1, 0)) // 1
  println(orElse(s2, 5)) // 5

  println(mapInt(Just(5))(_ + 1)) // Just(6)
  println(mapInt(Empty())(_ + 1)) // Empty

  println(filter(Just(5))(_ > 2)) // Just(5)
  println(filter(Just(5))(_ > 8)) // Empty
  println(filter(Empty())(_ > 2)) // Empty
