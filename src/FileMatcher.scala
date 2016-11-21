import java.io.File

/**
  * Created by camon on 2016-11-21.
  */
object FileMatcher {
  private def filesHere = new File(".").listFiles
//  def filesEnding(query: String) =
//    for (file <- filesHere; if file.getName.endsWith(query))
//      yield file

  def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }

  def filesEnding(query: String) =
    filesMatching(query, _.endsWith(_))

  def filesContaining(query: String) =
    filesMatching(query, _.contains(_))

  def filesRegex(query: String) =
    filesMatching(query, _.matches(_))
}
