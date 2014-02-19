import sbt._
import Keys._
import play.Project._



object ApplicationBuild extends Build {

  libraryDependencies ++= Seq(

  )

  val appName         = "authtestpro"
  val appVersion      = "1.0-SNAPSHOT"


  val datamodels = play.Project(appName + "-datamodels", appVersion, path = file("modules/data.models"))

  val businessmodels = play.Project(appName + "-businessmodels", appVersion, path = file("modules/business.models"))

  val dal = play.Project(appName + "-dal", appVersion, path = file("modules/dal")).dependsOn(datamodels)

  val bll = play.Project(appName + "-bll", appVersion, path = file("modules/bll")).dependsOn(businessmodels, datamodels, dal)

  val contracts = play.Project(appName + "-contracts", appVersion, path = file("modules/contracts")).dependsOn(bll)

  val helpers = play.Project(appName + "-helpers", appVersion, path = file("modules/helpers"))

  val main = play.Project(appName, appVersion).settings(
    // Add your own project settings here
  ).dependsOn(contracts, businessmodels).aggregate(contracts, businessmodels)

}