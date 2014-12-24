package use.basic.implicits

import org.scalatest.FunSuite


class ImplicitsSample01UseTest extends FunSuite {

  test("ImplicitsSample01Use#use1を呼ぶ") {
    val d = new ImplicitsSample01Use
    val actual = d.use1()

    assert(actual == "String")
  }

  test("ImplicitsSample01Use#use1を呼ぶ2") {
    val d = new ImplicitsSample01Use
    val actual = d.use2()

    assert(actual == "Double")
  }

}
