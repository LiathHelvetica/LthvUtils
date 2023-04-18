package lthv.conversion

import scala.concurrent.Future
import scala.util.Try

object TryConversion {

  implicit class TryExt[T](val t: Try[T]) extends AnyVal {
    def toFuture: Future[T] = Future.fromTry(t)
  }
}
