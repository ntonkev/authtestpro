package Traits

import scala.runtime.TraitSetter
import scaldi.Injector

trait IService {
  def doSomething(what_to_do: String): String
}