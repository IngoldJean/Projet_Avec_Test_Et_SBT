import com.apprentissagepersonnel.Point
import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import org.scalatest
import org.scalatest.{FlatSpec, Matchers}


class PointTest extends FlatSpec with Matchers{

  "get x position" should "return the correct result" in {
    var point = new Point(1,2,3)
    val result = point.getpositionx()
    result shouldBe(2)
  }

}
