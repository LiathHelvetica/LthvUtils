package lthv.collection.immutable

object String {
  def unapply(s: String): Option[(Char, String)] = s.headOption match {
    case Some(head) => Some(head, s.tail)
    case _ => None
  }
}
