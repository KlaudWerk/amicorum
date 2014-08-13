package controllers

import play.api._
import play.api.mvc._
import securesocial.core._
import service.DemoUser


class Application(override implicit val env: RuntimeEnvironment[DemoUser]) extends SecureSocial[DemoUser] {

  def index=SecuredAction { implicit request=>Ok(views.html.index(request.user.main))

  }
}