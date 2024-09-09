package gatlingHttpSample

import io.gatling.javaapi.http.HttpDsl.http
import io.gatling.javaapi.http.HttpDsl.status

object Requests {

    var simpleGetRequest = http("requestName")
        .get("contacts/")
        .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmRmMjk0NmQzZGNkZjAwMTMyMzQ5ZDYiLCJpYXQiOjE3MjU5MDEyMDV9.t5e1xvsCwrcGI4tCAY8VZDce_aU73fsj4e4OQjGoN80")
        .check(status().shouldBe(200))



//    http("name").put("https://gatling.io")
//    http("name").post("https://gatling.io")
//    http("name").delete("https://gatling.io")
//    http("name").head("https://gatling.io")
//    http("name").patch("https://gatling.io")
//    http("name").options("https://gatling.io")
//    http("name").httpRequest("PURGE", "http://myNginx.com")
}