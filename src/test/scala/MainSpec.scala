import Main._
import org.scalatest._
import flatspec._
import matchers._

class MainSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Main.findMiddleElement"

  it should "find middle element in list" in {
    findMiddleElement(List(1, 2, 3)) shouldBe Some(2)
    findMiddleElement(List(1, 4, 6, 7)) shouldBe Some(4)
    findMiddleElement(List(0, 12, 23, 44, 7, 88, 9)) shouldBe Some(44)
    findMiddleElement(List(0, 12, 23, 7, 88, 9)) shouldBe Some(23)
  }

}
