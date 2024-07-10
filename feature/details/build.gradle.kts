plugins {
    alias(libs.plugins.sample.android.library)
    alias(libs.plugins.sample.compose)
}

android {
    namespace = "com.nicolas.details"
}

dependencies {

    implementation(project(":core:navigation"))

    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.material3)
}