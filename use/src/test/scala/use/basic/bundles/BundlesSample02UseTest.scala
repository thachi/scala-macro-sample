package use.basic.bundles

import org.scalatest.FunSuite


class BundlesSample02UseTest extends FunSuite {

  test("BundlesSample02Use#use1を呼ぶ") {
    val d = new BundlesSample02Use
    val a = d.use1()

    assert(a == ())
  }

  test("BundlesSample02Use#use2を呼ぶ") {
    val d = new BundlesSample02Use
    val a = d.use2()

    assert(a == "String")
  }

}
