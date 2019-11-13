import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
	id("com.android.library")
//	kotlin("android")
	kotlin("multiplatform")
	id("maven-publish")
}

repositories {
    mavenCentral()
    jcenter()
}

group = "com.example"
version = "0.0.1"

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(15)
    }
}

kotlin {
    android {
        publishAllLibraryVariants()
    }
//	jvm()
    js {
        browser {
        }
        nodejs {
        }
    }
    // For ARM, should be changed to iosArm32 or iosArm64
    // For Linux, should be changed to e.g. linuxX64
    // For MacOS, should be changed to e.g. macosX64
    // For Windows, should be changed to e.g. mingwX64
    macosX64("macos") {
        binaries {
            framework()
        }
    }
    iosArm32()
    iosArm64()
    iosX64(){
        binaries {
            framework()
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

		val androidMain by getting {
			dependencies {
				implementation(kotlin("stdlib"))
			}
		}

		val androidTest by getting {
			dependencies {
				implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.12")
			}
		}

/*        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }*/
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
        val macosMain by getting {
        }
        val macosTest by getting {
        }

        getByName("iosArm32Main").dependsOn(macosMain)
        getByName("iosArm32Test").dependsOn(macosTest)
        getByName("iosArm64Main").dependsOn(macosMain)
        getByName("iosArm64Test").dependsOn(macosTest)
        getByName("iosX64Main").dependsOn(macosMain)
        getByName("iosX64Test").dependsOn(macosTest)

    }
}
