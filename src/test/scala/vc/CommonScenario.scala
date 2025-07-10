package vc

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder

object CommonScenario{

  def apply(): ScenarioBuilder = new CommonScenario().scn

}

class CommonScenario{
  val scn: ScenarioBuilder = scenario("test_scenario")
    .exec(actions.getMainPage)
    .exec(actions.getNew)
    .exec(actions.getCourses)
    .exec(actions.getPopular)


}

