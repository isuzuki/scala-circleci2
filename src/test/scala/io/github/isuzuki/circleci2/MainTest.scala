package io.github.isuzuki.circleci2

import org.scalatest.{Matchers, WordSpec}

class MainTest extends WordSpec with Matchers {
  "Main" can {
    "hello return" in {
      Main.hello shouldBe "hello"
    }
  }
}
