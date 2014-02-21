/**
 * Created by Nikola on 2/14/14.
 */

import modules.{WebModule, BusinessModule}
import play.api.GlobalSettings
import scaldi.play.ScaldiSupport

object Global extends GlobalSettings with ScaldiSupport {
  def applicationModule = new WebModule :: new BusinessModule
}

