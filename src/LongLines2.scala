import scala.io.Source

object LongLines2 {
  def processFile(filename: String, width: Int): Unit = {
    def processLine(filename: String, width: Int, line: String): Unit = {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }



}