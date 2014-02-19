package modules

import Traits.{IService, Service}
import Traits.{IClients, Clients}
import scaldi.Module
import scaldi.play.condition._

class BusinessModule extends Module{
  bind[IService] to new Service
  bind[IClients] to new Clients
}