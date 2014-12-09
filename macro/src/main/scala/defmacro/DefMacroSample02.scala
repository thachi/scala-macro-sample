package defmacro

import scala.reflect.macros.whitebox.Context

/**
 * 渡したクラスの情報を文字列で返すマクロ
 */
object DefMacroSample02 {

  def classInfo(a: Any): String = macro classInfo_impl

  def classInfo_impl(c: Context)(a: c.Expr[Any]): c.Expr[String] = {
    import c.universe._
//    val Literal(Constant(s_format: String)) = format.tree
//    val evals = ListBuffer[ValDef]()
//    def precompute(value: Tree, tpe: Type): Ident = {
//      val freshName = newTermName(c.fresh("eval$"))
//      evals += ValDef(Modifiers(), freshName, TypeTree(tpe), value)
//      Ident(freshName)
//    }
    c.Expr[String](q""" "test" """)
  }

}

