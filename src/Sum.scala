/**
  * Created by camon on 2016-11-19.
  */
object Sum {
  def sum(a: Int, b: Int, c: Int) = a + b + c

  def main(args: Array[String]): Unit = {
    val total: Int = sum(1, 2, 3)
    println(total)

    val a = sum _

    val total2 = a(1, 2, 3)
    println(total2)

    val total3 = a.apply(1, 2, 3)
    println(total3)

    /////////////

    // 인자를 하나만 받는 apply함수를 만든다.
    val b = sum(1, _: Int, 3)
    println(b(2)) // b.apply가 sum(1,2,3)을 호출한다. = 6

    println(b(5)) // sum(1, 5, 3)  = 9


  }
}
