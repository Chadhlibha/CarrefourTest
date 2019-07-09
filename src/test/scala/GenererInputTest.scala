import gestionInput.GenererInput
import org.scalatest.FunSuite

class GenererInputTest extends FunSuite {

  val path = "./"
  val firstDay = "20190708"
  val nbrOfDays = 7
  val genererInput = new GenererInput(path,"/dataTest",firstDay, nbrOfDays)

  test("Test the list containing all days") {
    val actual = genererInput.generateListOfDays("2019", "07", "08")
      .map(day =>day.split("T")(0))
    val expected = List("20190708", "20190709", "20190710", "20190711", "20190712", "20190713", "20190714")
    assert(actual == expected)
  }

}
