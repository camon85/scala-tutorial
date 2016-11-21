/**
  * Created by camon on 2016-11-21.
  */
object Speed {
  def main(args: Array[String]): Unit = {
    println(speed(100, 10))

    // 이름 붙인 인자를 호출하면 인자들의 순서를 바꾸어 전달할 수 있다.
    print(speed(time=10, distance = 100))
  }

  def speed(distance: Float, time: Float): Float = distance / time
}
