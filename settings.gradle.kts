plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "notebooks-ktor-client"
include("json-generation")
include("ktor-client")
