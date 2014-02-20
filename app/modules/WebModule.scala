package modules

/**
 * Created by Nikola on 2/14/14.
 */
import controllers.{Application}
import scaldi.Module

class WebModule extends Module {
  binding to new Application
}
