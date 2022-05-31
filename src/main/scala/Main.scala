import scala.annotation.tailrec

object Main {

  def findMiddleElement[T](xs: List[T]): Option[T] = {
    @tailrec
    def loop(ys: List[T], acc: List[T], cnt: Int): Option[T] = {
      ys match {
        case head :: _ if cnt % 2 != 0 => loop(ys.init, acc.init, cnt + 1)
        case head :: _ => loop(ys.init, acc, cnt + 1)
        case Nil => acc.reverse.headOption
      }
    }

    loop(xs, xs, 0)
  }

}
