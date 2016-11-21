import java.io.File

/**
  * Created by camon on 2016-11-21.
  */
object FileMatcher2 {
  private def filesHere = new File(".").listFiles

  def filesMatching(matcher: String => Boolean) = {
    for (file <- filesHere; if matcher(file.getName))
      yield file
  }

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))
}
