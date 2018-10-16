import scala.collection.mutable.ArrayBuffer

object Main extends App {

  if (args.length != 0) {
    var results :ArrayBuffer[Int] = new ArrayBuffer[Int]
    args.foreach(a => results += a.toInt)
    println("Fizz Buzz results for given values: " + (FizzBuzzCalculator.getFizzBuzz(results.toSeq)).toString())
    //println(FizzBuzzCalculator.getFizzBuzz(results.toSeq))

  } else {
    val values = Seq(-2, -1, 0, 1, 2, 3, 99, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
    println("Fizz Buzz example results for these default values: " + values.toString())
    println("Results: " + (FizzBuzzCalculator.getFizzBuzz(values)).toString())

  }

}
