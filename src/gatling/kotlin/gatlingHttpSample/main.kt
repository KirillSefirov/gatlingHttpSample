

import gatlingHttpSample.LoadProfile
import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

fun main() {
//    println("ENV_VARIABLES ${System.getenv()}")
    val props = GatlingPropertiesBuilder()
        .simulationClass(LoadProfile::class.qualifiedName)
    Gatling.fromMap(props.build())
}

