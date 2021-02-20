plugins {
    kotlin("jvm") version "1.4.30"
}

repositories {
    jcenter()
    maven("https://kotlin.bintray.com/dukat/")
}

dependencies {
    implementation("org.jetbrains.dukat:dukat:0.5.8-rc.4")
}
