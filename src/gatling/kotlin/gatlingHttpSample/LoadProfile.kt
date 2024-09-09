package gatlingHttpSample

import gatlingHttpSample.Protocol.httpProtocol
import gatlingHttpSample.Scenario.scn
import io.gatling.javaapi.core.CoreDsl.atOnceUsers
import io.gatling.javaapi.core.Simulation

class LoadProfile: Simulation() {
    override fun before() {
//        Helper().prepareCustomReportsFolder()
    }

    override fun after() {
//        Helper().createDataframeWithRequestTimes()
    }
    //Before Launch
    // Clear the required auction using tool demo-utils
    // Launch test PrepareForBidTimingsTests

    init {
        setUp(scn.injectOpen(atOnceUsers(1)).protocols(httpProtocol))  //.protocols(httpProtocol))
    }
}