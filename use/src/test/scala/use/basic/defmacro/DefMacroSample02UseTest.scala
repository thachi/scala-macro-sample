package use.basic.defmacro

import org.scalatest.FunSuite


class DefMacroSample02UseTest extends FunSuite {

  test("DefMacroSample02Use#use1を呼ぶ") {
    val d = new DefMacroSample02Use
    val ret = d.use1()

    println(ret)
    assert(ret == "java.lang.String")
  }

}
