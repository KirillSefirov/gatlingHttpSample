package gatlingHttpSample

import io.gatling.javaapi.http.HttpDsl.http

object Protocol {
//    private val env: String = System.getenv("ENVIRONMENT")
//    private val cluster: String = System.getenv("CLUSTER")
//    val host1 = ""
//    val host2 = ""
//
//    val protocol1 = grpc(ManagedChannelBuilder.forAddress(host1, 443))
//    val protocol2 = grpc(ManagedChannelBuilder.forAddress(host2, 443))

    val httpProtocol = http.baseUrl("https://thinking-tester-contact-list.herokuapp.com/")
}