package de.lolhens.jstubber

import java.nio.file.Paths

object Main {
  def main(args: Array[String]): Unit = {
    Stubber.MIXIN.stubDirectory(Paths.get("src/main/resources"), Paths.get("out"))
  }
}
