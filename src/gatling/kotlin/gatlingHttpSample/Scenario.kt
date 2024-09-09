package gatlingHttpSample

import io.gatling.javaapi.core.CoreDsl.*

object Scenario {

    val scn = scenario("Scenario")
        .exec(Requests.simpleGetRequest)


//    val bidCalculatorScenario = scenario("BidCalculator Scenario with Distribution").randomSwitch().on(
//        Choice.withWeight(50.0, exec(CalculatorRequests.scen1)),
//        Choice.withWeight(30.0, exec(CalculatorRequests.scen2)),
//        Choice.withWeight(20.0, exec(CalculatorRequests.scen3)),
//    )

}

