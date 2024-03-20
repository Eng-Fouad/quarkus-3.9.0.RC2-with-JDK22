dependencyResolutionManagement {
    versionCatalogs {
        create("deps") {
            version("quarkusLibVersion", "3.9.0.CR2") // https://central.sonatype.com/artifact/io.quarkus/quarkus-bom
            plugin("quarkus", "io.quarkus").versionRef("quarkusLibVersion")
            library("libs.quarkus.bom", "io.quarkus", "quarkus-bom").versionRef("quarkusLibVersion")
            library("libs.quarkus.resteasy.reactive.jackson", "io.quarkus", "quarkus-resteasy-reactive-jackson").versionRef("quarkusLibVersion")
            library("libs.quarkus.junit5", "io.quarkus", "quarkus-junit5").versionRef("quarkusLibVersion")
        }
    }
}

rootProject.name = "quarkus-3.9.0.RC2-with-JDK22"