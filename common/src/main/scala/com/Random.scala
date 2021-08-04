package main.scala.com

import java.time.Instant

import org.json4s._
import org.json4s.native.Serialization

trait Random {
implicit  val format = DefaultFormats

  implicit val serialization: Serialization.type = Serialization
  def getCurrentInstant(): Instant = Instant.now()

  def obc(string: JValue) = {
    val data = string.extract[String]
    println(data)
  }
}
