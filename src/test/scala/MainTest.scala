class MainTest extends org.scalatest.FunSuite {

  test("Main.getOutputStr") {
    var exampleValues = Seq(4, 5, 6)
    assert(Main.getOutputStr(exampleValues) === "4, Buzz, Fizz")

    exampleValues = Seq(7, 0, 99)
    assert(Main.getOutputStr(exampleValues) === "7, 0, Fizz")
  }

}
