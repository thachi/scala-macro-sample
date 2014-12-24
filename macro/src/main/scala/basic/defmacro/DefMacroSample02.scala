package basic.defmacro

import scala.reflect.macros.whitebox.Context

/**
 * 渡したクラスの情報を文字列で返すマクロ
 */
object DefMacroSample02 {

  def classInfo(a: Any): String = macro classInfo_impl

  def classInfo_impl(c: Context)(a: c.Expr[Any]): c.Expr[String] = {
    import c.universe._

    val name = a.actualType.typeSymbol.fullName
    val nameString = Literal(Constant(name))

    c.Expr[String](nameString)
  }

}

