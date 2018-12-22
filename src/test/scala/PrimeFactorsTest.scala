import org.scalatest.{FlatSpec, Matchers}
import primeFactors.PrimeFactors

class PrimeFactorsTest extends FlatSpec with Matchers {

  "Prime factors for 1" should "return nothing if 1 is the argument of generate" in{
    val x = new PrimeFactors
    val expected : List[Int] = List[Int]()
    val result = x.generate(1)
    result shouldBe expected
  }

  "Prime factors for 2" should "return 2 if 2 is the argument of generate" in{
    val x = new PrimeFactors
    var expected: List[Int] = List[Int]()
    expected = expected.:::(List(2))
    val result = x.generate(2)
    result shouldBe expected
  }

  "Prime factors for 3" should "return 3 if 3 is the argument of generate" in{
    val x = new PrimeFactors
    var expected: List[Int] = List[Int]()
    expected = expected.:::(List(3))
    val result = x.generate(3)
    result shouldBe expected
  }

  "Prime factors for 4" should "return 2,2 if 4 is the argument of generate" in{
    val x = new PrimeFactors
    var expected: List[Int] = List[Int]()
    expected = expected.:::(List(2,2))
    val result = x.generate(4)
    result shouldBe expected
  }

  "Prime factors for 6" should "return 2,3 if 6 is the argument of generate" in{
    val x = new PrimeFactors
    var expected: List[Int] = List[Int]()
    expected = expected.:::(List(3,2))
    val result = x.generate(6)
    result shouldBe expected
  }

  "Prime factors for 8" should "return 2,2,2 if 8 is the argument of generate" in{
    val x = new PrimeFactors
    var expected: List[Int] = List[Int]()
    expected = expected.:::(List(2,2,2))
    val result = x.generate(8)
    result shouldBe expected
  }

  "Prime factors for 9" should "return 3,3 if 9 is the argument of generate" in{
    val x = new PrimeFactors
    var expected: List[Int] = List[Int]()
    expected = expected ::: List(3, 3)
    val result = x.generate(9)
    result shouldBe expected
  }
}
