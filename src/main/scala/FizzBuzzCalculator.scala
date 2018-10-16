import scala.collection.mutable.{ArrayBuffer}

object FizzBuzzCalculator {

  def evenByThree(x: Int) : Boolean  = {
    if ((x % 3) == 0) true else false
  }

  def evenByFive(x: Int) : Boolean  = {
    if ((x % 5) == 0) true else false
  }

  def evenByThreeAndFive(x: Int) : Boolean = {
    if (evenByThree(x) && evenByFive(x)) true
    else false
  }

  def notAllowedValue(x: Int) : Boolean = {
    if (x < 1) true else false
  }

  def getFizzBuzzResult(x: Int) : String = {
    if (notAllowedValue(x)) x.toString()
    else if (evenByThreeAndFive(x)) "Fizz Buzz"
    else if (evenByFive(x)) "Buzz"
    else if (evenByThree(x)) "Fizz"
    else x.toString
  }

  def getFizzBuzz(values: Seq[Int]) : Seq[String] = {
    var results :ArrayBuffer[String] = new ArrayBuffer[String]
    val resValues :Seq[String] = Seq()
    for (x <- values) {
      results += getFizzBuzzResult(x)
    }
    return results.toSeq
  }
}
