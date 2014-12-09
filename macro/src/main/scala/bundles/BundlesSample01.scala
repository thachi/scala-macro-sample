package bundles

import scala.reflect.macros.blackbox.Context

/**
 * マクロバンドルの実装
 *
 * http://docs.scala-lang.org/ja/overviews/macros/bundles.html
 */
class BundlesSample01Impl(val c: Context) {
  def mono = c.literalUnit
  def poly[T: c.WeakTypeTag] = c.literal(c.weakTypeOf[T].toString)
}

object BundlesSample01 {
  // IDEA1 3 + Scala 0.31.437では↓のBundlesSample01Implが赤く表示される。。。
  // エラーは「Cannot resolve symbol BundlesSample01Impl」
  def mono = macro BundlesSample01Impl.mono
  def poly[T] = macro BundlesSample01Impl.poly[T]
}