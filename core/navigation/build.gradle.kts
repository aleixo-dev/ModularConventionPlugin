plugins {
    alias(libs.plugins.sample.android.library)
    kotlin("plugin.serialization") version "2.0.0"
}

android {
    namespace = "com.nicolas.navigation"
}

dependencies {

    implementation(libs.androix.compose.navigation)
    implementation(libs.kotlin.serialization)
}