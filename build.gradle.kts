plugins {
    java
    alias(deps.plugins.quarkus)
}

group = "io.fouad"
version = "1.0"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(platform(deps.libs.quarkus.bom))
    implementation(deps.libs.quarkus.resteasy.reactive.jackson)
    testImplementation(deps.libs.quarkus.junit5)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(22))
    }
}

tasks.quarkusDev {
    doFirst {
        System.setProperty("quarkus.analytics.disabled", "true")
    }
    workingDirectory.set(project.projectDir)
}

tasks.test {
    useJUnitPlatform()
}