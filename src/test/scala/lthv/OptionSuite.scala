package lthv

import lthv.conversion.OptionConversion.OptionExt
import org.scalatest.funsuite.AnyFunSuite

import scala.util.Success

class OptionSuite extends AnyFunSuite {

  test("Some converts to Success") {
    assert(Option(1).toTry(new Exception("")) == Success(1))
  }

  test("None converts to Failure") {
    assert(Option.empty[Int].toTry(new Exception("")).isFailure)
  }
}
