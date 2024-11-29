plugins {
    application
    kotlin("jvm") version(libs.versions.kotlin)
    id("dev.kordex.gradle.kordex") version(libs.versions.kordex)
    id("com.google.cloud.tools.jib") version(libs.versions.jib)
}

dependencies {
    testImplementation(libs.bundles.testing)
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

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

application {
    mainClass = "com.github.ya0igoddess.ziz.MainKt"
}