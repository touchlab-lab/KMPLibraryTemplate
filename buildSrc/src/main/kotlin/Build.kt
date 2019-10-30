@file:Suppress("ConstantConditionIf", "EXPERIMENTAL_API_USAGE", "MemberVisibilityCanBePrivate")

import java.util.*
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.maven

object Build {

}

fun RepositoryHandler.addRepos() {
    google()
    jcenter()
    mavenCentral()
}