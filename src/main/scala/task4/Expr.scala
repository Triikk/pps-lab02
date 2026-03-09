package task4

@main
def arithmeticExpressions() : Unit =
  enum Expr:
    case Literal(n : Int)
    case Add(e1 : Expr, e2 : Expr)
    case Multiply(e1 : Expr, e2 : Expr)

  object Expr:
    def evaluate(expr : Expr) : Int = expr match {
      case Expr.Literal(n) => n
      case Expr.Add(e1,e2) => evaluate(e1) + evaluate(e2)
      case Expr.Multiply(e1,e2) => evaluate(e1) * evaluate(e2)
    }
    def show(expr : Expr) : String = expr match {
      case Expr.Literal(n) => n.toString
      case Expr.Add(e1,e2) => "(" + show(e1) + "+" + show(e2) + ")"
      case Expr.Multiply(e1, e2) => "(" + show(e1) + "*" + show(e2) + ")"
    }

  import Expr.*

  val expr : Expr = Multiply(Add(Literal(5),Literal(2)), Literal(10))
  println(show(expr))
  println(evaluate(expr))