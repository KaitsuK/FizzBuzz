import scala.collection.mutable.ArrayBuffer

object FizzBuzzCalculator extends App {

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
    for (x <- values) {
      results += getFizzBuzzResult(x)
    }
    return results.toSeq
  }

  val values = Seq(-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
  val res = getFizzBuzz(values)
  //for (name <- res) println(name)
  println(res)

}