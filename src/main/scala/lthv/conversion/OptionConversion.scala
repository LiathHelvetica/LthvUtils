package lthv.conversion

import scala.util.Try
import scala.util.Success
import scala.util.Failure

object OptionConversion {

  implicit class OptionExt[T](val o: Option[T]) extends AnyVal {

    def toTry(otherwise: Throwable): Try[T] = o match {
      case Some(t) => Success(t)
      case None => Failure(otherwise)
    }
  }
}
