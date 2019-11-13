buildscript {
    repositories {
		google()
		jcenter()
		mavenCentral()
	}

    dependencies {
        classpath(ClassPaths.KotlinGradlePlugin)
		classpath(ClassPaths.AndroidGradlePlugin)
    }
}

allprojects {
    repositories {
		google()
		jcenter()
		mavenCentral()
	}
}
