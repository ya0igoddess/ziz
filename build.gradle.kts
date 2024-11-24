plugins {
    application
    kotlin("jvm") version(libs.versions.kotlin)
    id("dev.kordex.gradle.kordex") version(libs.versions.kordex)
}

application {
    mainClass = "com.github.ya0igoddess.ziz.MainKt"
}