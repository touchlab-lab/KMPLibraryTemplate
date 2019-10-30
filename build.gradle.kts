buildscript {
    repositories {
        addRepos()
    }

    dependencies {
        classpath(ClassPaths.KotlinGradlePlugin)
    }
}

allprojects {
    repositories {
        addRepos()
    }
}