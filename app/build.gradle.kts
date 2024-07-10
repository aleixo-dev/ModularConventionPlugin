@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.sample.android.application)
    alias(libs.plugins.sample.compose)
}

android {
    namespace = "com.nicolas.conventionalpluginmodularization"

    defaultConfig {
        applicationId = "com.nicolas.conventionalpluginmodularization"
    }
}

dependencies {

    implementation(project(":core:navigation"))
    implementation(project(":feature:home"))
    implementation(project(":feature:details"))

    // Core Android Dependencies
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Compose
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.material3)
    implementation(libs.androix.compose.navigation)

}