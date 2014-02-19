package Traits

import scala.runtime.TraitSetter
import scaldi.Injector

trait IClients {
  //In the real app there will be a real model
  def RegisterClient(name: String, code: String): Boolean
  def UpdateClient(number: Int, name: String, code: String): Boolean
  def RemoveClient(number: Int): Boolean
  def DisableClient(number: Int): Boolean


  }