plugins {
    application
    kotlin("jvm") version(libs.versions.kotlin)
    id("dev.kordex.gradle.kordex") version(libs.versions.kordex)
    id("com.google.cloud.tools.jib") version(libs.versions.jib)
}

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5${libs.versions.junit5}")
}

jib {
    from {
        image = "openjdk:17-alpine"
    }
    to {
        image = "ziz"
    }
    container {
        mainClass = "com.github.ya0igoddess.ziz.MainKt"
    }
}

application {
    mainClass = "com.github.ya0igoddess.ziz.MainKt"
}