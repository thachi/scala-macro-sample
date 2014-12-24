package basic.bundles

import scala.reflect.macros.blackbox
import scala.reflect.macros.blackbox.Context

/**
 * 01のdeprecatedを改善しました
 */
class BundlesSample02Impl(val c: blackbox.Context) {
  import c.universe._
  def mono: Literal = Literal(Constant(()))
  def poly[T: c.WeakTypeTag]: Literal = {
    Literal(Constant(c.weakTypeOf[T].toString))
  }
}

object BundlesSample02 {
  // IDEA1 3 + Scala 0.31.437では↓のBundlesSample01Implが赤く表示される。。。
  // エラーは「Cannot resolve symbol BundlesSample01Impl」
  def mono: Unit = macro BundlesSample02Impl.mono
  def poly[T]: String = macro BundlesSample02Impl.poly[T]
}