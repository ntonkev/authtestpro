package controllers

import Traits.{IService}
import play.api._
import play.api.mvc._
import scaldi.{Injectable, Injector}
import scala.slick.driver.PostgresDriver.simple._
import play.api.db.DB

class Application(implicit inj: Injector) extends Controller with Injectable {
  val service = inject [IService]

  def index = Action {
    val str: String = "TEST calling service.doSomething: Your new application is ready now !!!"

    //scala.slick.model.codegen.SourceCodeGenerator.main(Array("scala.slick.driver.PostgresDriver","org.postgresql.Driver","jdbc:postgresql://ec2-54-200-218-97.us-west-2.compute.amazonaws.com/sandbox?user=postgres&password=Password1?","c:\\Dev\\Projects\\authtestpro\\modules\\data.models\\app","DALTables"))

    Ok(views.html.index(service.doSomething(str)))
  }

}