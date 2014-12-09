package use.defmacro

import org.scalatest.FunSuite


class DefMacroSample01UseTest extends FunSuite {

  test("DefMacroSample01Use#use1を呼ぶ") {
    val d = new DefMacroSample01Use
    d.use1()

    assert(true)
  }

}
