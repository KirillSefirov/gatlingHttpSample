group = "com.phillips.platform.tests"
version = "0.0.1-SNAPSHOT"

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

plugins {
    java
    id("io.gatling.gradle") version "3.9.2.1"
    id("com.bmuschko.docker-java-application") version "9.3.1"
    id("org.jetbrains.kotlinx.dataframe") version "0.12.0"
    kotlin("jvm") version "1.8.21" // or kotlin("multiplatform") or any other kotlin plugin
    kotlin("plugin.serialization") version "1.8.21"

}

repositories {
    mavenCentral()
}

dependencies {
    gatling("com.github.phisgr:gatling-grpc:0.16.0")
    gatling("com.github.phisgr:gatling-grpc-kt:0.15.1")
    gatling("ru.tinkoff:gatling-picatinny_2.13:0.13.0") // ??
    gatling("ch.qos.logback.contrib:logback-janino-fragment:0.1.5")
    gatling("org.codehaus.janino:janino:3.1.8")
    gatling("com.squareup.okhttp3:okhttp:4.10.0")
    gatling("net.logstash.logback:logstash-logback-encoder:7.3")
    gatling("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
    gatling("org.jetbrains.kotlinx:dataframe:0.12.0")
    implementation(kotlin("stdlib-jdk8"))
}

gatling {
    //TODO
}

kotlin {
    jvmToolchain(17)
}