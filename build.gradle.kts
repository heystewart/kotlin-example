repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://kotlin.bintray.com/kotlinx")
}

plugins {
    kotlin("multiplatform") version "1.4-M1"
}

kotlin {
    js {
        browser()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}
