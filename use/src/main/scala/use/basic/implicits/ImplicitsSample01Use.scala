package use.basic.implicits

import basic.implicits._

class ImplicitsSample01Use {

  def use1() = {
    ImplicitMacroSample01.show("aaa")
  }

  def use2() = {

    val a = Showable.materializeShowable[String]
    println(a.showStringHoge)



    ImplicitMacroSample01.show(11.2)
  }

}
