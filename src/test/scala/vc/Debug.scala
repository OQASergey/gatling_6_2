package vc

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.Predef.Simulation

class Debug extends Simulation{
  setUp(CommonScenario().inject(atOnceUsers(2)))
    .protocols(vc.httpProtocol)

}
