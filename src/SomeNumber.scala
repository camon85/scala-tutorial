/**
  * Created by camon on 2016-11-19.
  */
object SomeNumber {
  def main(args: Array[String]): Unit = {
    val someNumbers =List(-11, -10, -5, 0, 5, 10)
    println(someNumbers)

    println(someNumbers.filter((x: Int) => x > 0))
    println(someNumbers.filter((x) => x > 0)) // target typing
    println(someNumbers.filter(x => x > 0))
    println(someNumbers.filter(_ > 0))

    someNumbers.foreach(x => println(x))
    someNumbers.foreach(println _)
    someNumbers.foreach(println)

  }

}
