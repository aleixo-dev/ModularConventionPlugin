plugins {
    alias(libs.plugins.sample.android.library)
    alias(libs.plugins.sample.compose)
}

android {
    namespace = "com.nicolas.home"
}

dependencies {

    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.material3)
}