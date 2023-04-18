package lthv

import lthv.collection.immutable.String
import org.scalatest.funsuite.AnyFunSuite

class StringExtractorSuite extends AnyFunSuite {

  test("String extractor allows for string pattern matching") {

    val head: String = "a"
    val tail: String = "b"
    val target: String = head + tail

    val outcome = target match {
      case String(head, tail) => (head, tail)
      case _ => ()
    }

    assert(outcome == (head.toCharArray.head, tail))
  }

}
