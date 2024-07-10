package com.google.conventional.modularization

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

@Suppress("UnstableApiUsage")
internal fun Project.configureCompose(commonExtension: BaseExtension) {

    commonExtension.apply {
        buildFeatures.apply {
            compose = true
        }

        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

        composeOptions {
            kotlinCompilerExtensionVersion =
                libs.findVersion("androidxComposeCompiler").get().toString()
        }

        dependencies {
            add("implementation", platform(libs.findLibrary("androidx.compose.bom").get()))
        }
    }
}