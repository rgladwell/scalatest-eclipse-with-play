package controllers

import play.api.test._
import play.api.test.Helpers._
import org.scalatest.WordSpec
import org.scalatest.Matchers
import org.scalatestplus.play.OneAppPerSuite
import play.api.i18n.Messages.Implicits._

class ApplicationSpec extends WordSpec with Matchers with OneAppPerSuite {

  "Application" should {

    val controller = new Application

    "render the index page" in {
      status(controller.index().apply(FakeRequest(GET, "/boum"))) shouldBe OK
    }

  }

}
