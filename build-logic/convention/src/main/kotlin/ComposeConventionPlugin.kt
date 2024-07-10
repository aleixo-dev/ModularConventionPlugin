import com.android.build.gradle.BaseExtension
import com.google.conventional.modularization.configureCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class ComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            val extensions = extensions.getByType<BaseExtension>()
            configureCompose(extensions)
        }
    }
}