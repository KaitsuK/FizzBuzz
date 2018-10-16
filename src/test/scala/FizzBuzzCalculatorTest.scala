class FizzBuzzCalculatorTest extends org.scalatest.FunSuite {

  test("FizzBuzzCalculator.notAllowedValue") {
    assert(FizzBuzzCalculator.notAllowedValue(-3) === true)
    assert(FizzBuzzCalculator.notAllowedValue(7) === false)
    assert(FizzBuzzCalculator.notAllowedValue(0) === true)
    assert(FizzBuzzCalculator.notAllowedValue(30) === false)
  }

  test("FizzBuzzCalculator.evenByThree") {
    assert(FizzBuzzCalculator.evenByThree(3) === true)
    assert(FizzBuzzCalculator.evenByThree(7) === false)
    assert(FizzBuzzCalculator.evenByThree(13) === false)
    assert(FizzBuzzCalculator.evenByThree(30) === true)
  }

  test("FizzBuzzCalculator.evenByFive") {
    assert(FizzBuzzCalculator.evenByFive(15) === true)
    assert(FizzBuzzCalculator.evenByFive(13) === false)
    assert(FizzBuzzCalculator.evenByFive(20) === true)
    assert(FizzBuzzCalculator.evenByFive(8) === false)
  }

  test("FizzBuzzCalculator.evenByThreeAndFive") {
    assert(FizzBuzzCalculator.evenByThreeAndFive(15) === true)
    assert(FizzBuzzCalculator.evenByThreeAndFive(20) === false)
    assert(FizzBuzzCalculator.evenByThreeAndFive(30) === true)
    assert(FizzBuzzCalculator.evenByThreeAndFive(100) === false)
  }

  test("FizzBuzzCalculator.getFizzBuzzResult") {
    assert(FizzBuzzCalculator.getFizzBuzzResult(15) === "Fizz Buzz")
    assert(FizzBuzzCalculator.getFizzBuzzResult(19) === "19")
    assert(FizzBuzzCalculator.getFizzBuzzResult(30) === "Fizz Buzz")
    assert(FizzBuzzCalculator.getFizzBuzzResult(25) === "Buzz")
  }

}
