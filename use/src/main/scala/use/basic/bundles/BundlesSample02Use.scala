package use.basic.bundles

import basic.bundles.BundlesSample02

class BundlesSample02Use {

  def use1() = {
    val a = BundlesSample02.mono
    a
  }

  def use2() = {
    val a = BundlesSample02.poly[String]
    a
  }

}
