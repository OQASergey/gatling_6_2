package vc

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object actions {
  val getMainPage: HttpRequestBuilder = http("get Main Page")
    .get("/")

  val getPopular: HttpRequestBuilder = http("get Popular")
    .get("/popular")

  val getNew: HttpRequestBuilder = http("get New")
    .get("/new")

  val getCourses: HttpRequestBuilder = http("get Courses")
    .get("/courses")

}
