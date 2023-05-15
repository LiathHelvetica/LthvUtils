package lthv

object NumericUtils {

  def --[T](x: T)(implicit n: Numeric[T]): T = n.minus(x, n.one)

  def ++[T](x: T)(implicit n: Numeric[T]): T = n.plus(x, n.one)

  implicit class NumericOps[T](val x: T) extends AnyVal {

    def --(implicit n: Numeric[T]): T = NumericUtils.--(x)

    def ++(implicit n: Numeric[T]): T = NumericUtils.++(x)
  }
}
