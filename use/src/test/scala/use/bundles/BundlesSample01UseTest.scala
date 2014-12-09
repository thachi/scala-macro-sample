package use.bundles

import org.scalatest.FunSuite


class BundlesSample01UseTest extends FunSuite {

  test("BundlesSample01Use#use1を呼ぶ") {
    val d = new BundlesSample01Use
    val a = d.use1()

    assert(a == "a")
  }

  test("BundlesSample01Use#use2を呼ぶ") {
    val d = new BundlesSample01Use
    val a = d.use2()

    assert(a == "String")
  }

}
