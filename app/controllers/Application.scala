package controllers

import play.api._
import play.api.mvc._
import scala.concurrent.Future
import play.api.i18n.MessagesApi
import javax.inject.Inject

class Application @Inject()(implicit val messagesApi: MessagesApi) extends Controller {

  def index = Action.async {
    Future.successful(Ok(views.html.index("Your new application is ready.")))
  }

}
