package lthv

import lthv.conversion.TryConversion.TryExt
import org.scalatest.funsuite.AnyFunSuite

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.util.{Success, Failure}

class TrySuite extends AnyFunSuite {

  test("Success converts to successful Future") {

    val f = Success(1).toFuture

    assert(Await.result(f, Duration.Inf) == 1)
  }

  test("Failure converts to failed Future") {

    val f = Failure(new Exception("")).toFuture

    assertThrows[Exception](Await.result(f, Duration.Inf))
  }
}
