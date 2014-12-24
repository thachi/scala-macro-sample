package use.basic.bundles

import basic.bundles.BundlesSample01

class BundlesSample01Use {

  def use1() = {
    val a = BundlesSample01.mono
    a
  }

  def use2() = {
    val a = BundlesSample01.poly[String]
    a
  }

}
