package controllers

import Traits.{IService}
import play.api._
import play.api.mvc._
import scaldi.{Injectable, Injector}

class Application(implicit inj: Injector) extends Controller with Injectable {
  val service = inject [IService]

  def index = Action {
    val str: String = "TEST calling service.doSomething: Your new application is ready now !!!"
    Ok(views.html.index(service.doSomething(str)))
  }

}