package basic.implicits

import scala.reflect.macros.whitebox.Context

/**
 * 以下の內容そのままを動かすことができます。
 *
 * http://docs.scala-lang.org/ja/overviews/macros/basic.implicits.html
 */
object ImplicitMacroSample01 {

  def show[T](x: T)(implicit s: Showable[T]) = s.show(x)

}


trait Showable[T] {
  def show(x: T): String
}

object Showable {
  implicit def materializeShowable[T]: Showable[T] = macro showable_impl[T]

  def showable_impl[T: c.WeakTypeTag](c: Context): c.Expr[Showable[T]] = {
    import c.universe._

    val sym = c.weakTypeOf[T].typeSymbol
    val t = sym.asType.name
    val name = Literal(Constant(t.toString))
    //
    //    val s = c.weakTypeOf[T].termSymbol.asTerm.name

    val methodName = TermName("show" + t.toString + "Hoge")

    c.Expr[Showable[T]]( q"""
          new Showable[$t] {
              def show(a: $t) = { $name }
              def $methodName = "test"
          }
""")

  }


}

