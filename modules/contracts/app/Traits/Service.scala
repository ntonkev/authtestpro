package Traits

class Service extends IService {
  def doSomething(what_to_do: String) = {
    val success = what_to_do
    try {
      println(what_to_do)
    }
    catch {
      case e: Exception => {
        e.printStackTrace()
        ""
      }
    }

    success
  }
}