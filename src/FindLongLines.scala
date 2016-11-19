/**
  * Created by camon on 2016-11-19.
  */
object FindLongLines {
  def main(args: Array[String]): Unit = {
    val width = args(0).toInt
    for (arg <- args.drop(1))
//      LongLines.processFile(arg, width)
//      LongLines2.processFile(arg, width)
      LongLines3.processFile(arg, width)
  }
}
