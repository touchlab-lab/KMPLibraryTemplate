buildscript {
    repositories {
		addRepos()
	}

    dependencies {
        classpath(ClassPaths.KotlinGradlePlugin)
		classpath(ClassPaths.AndroidGradlePlugin)
    }
}

allprojects {
    repositories {
		addRepos()
	}
}
