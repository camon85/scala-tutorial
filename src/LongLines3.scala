import scala.io.Source

object LongLines3 {
  def processFile(filename: String, width: Int) {
    def processLine(line: String) {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }



}