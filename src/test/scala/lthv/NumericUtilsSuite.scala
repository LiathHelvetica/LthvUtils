package lthv

import lthv.NumericUtils.NumericOps
import org.scalatest.funsuite.AnyFunSuite

class NumericUtilsSuite extends AnyFunSuite {

  test("-- operator works on Int") {

    val in = 1

    val out = in.--

    assert(out == in - 1)
  }

  test("++ operator works on Int") {

    val in = 1

    val out = in.++

    assert(out == in + 1)
  }

  test("-- operator works on Double") {

    val in = 1.0

    val out = in.--

    assert(out == 1.0 - 1.0)
  }
}
