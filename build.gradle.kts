plugins {
    application
    kotlin("jvm") version(libs.versions.kotlin)
    id("dev.kordex.gradle.kordex") version(libs.versions.kordex)
    id("com.google.cloud.tools.jib") version(libs.versions.jib)
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