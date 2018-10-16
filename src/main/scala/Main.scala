import scala.collection.mutable.ArrayBuffer

object Main extends App {

  if (args.length != 0) {
    var givenValues :ArrayBuffer[Int] = new ArrayBuffer[Int]
    args.foreach(arg => givenValues += arg.toInt)
    println("Fizz Buzz results for given values: " + getOutputStr(givenValues))

  } else {
    val exampleValues = Seq(-2, -1, 0, 1, 2, 3, 99, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
    println("Fizz Buzz example results for the default values: " + getOutputStr(exampleValues))
  }

  def getOutputStr(values: Seq[Int]) :String = {
    var resultString : String = ""
    FizzBuzzCalculator.getFizzBuzz(values).foreach(item => resultString += (item + ", "))
    resultString = resultString.dropRight(2) // drop the last comma out
    return resultString
  }
}
