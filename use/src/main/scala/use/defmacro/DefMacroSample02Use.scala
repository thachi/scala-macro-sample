package use.defmacro

import defmacro.DefMacroSample02

class DefMacroSample02Use {

  def use1(): String = {
    val a = DefMacroSample02.classInfo("hoge")
    a
  }

}
