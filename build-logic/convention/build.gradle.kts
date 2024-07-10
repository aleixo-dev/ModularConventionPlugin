plugins {
    `kotlin-dsl`
}

group = "com.nicolas.conventionalpluginmodularization.modularization.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.android.tools.build.gradle)
}

gradlePlugin {
    plugins {
        register("sampleAndroidApplication") {
            id = "sample.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("sampleCompose") {
            id = "sample.compose"
            implementationClass = "ComposeConventionPlugin"
        }
        register("sampleLibrary") {
            id = "sample.library"
            implementationClass = "AndroidApplicationLibraryPlugin"
        }
    }
}