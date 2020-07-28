import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(Versions.sdkTargetVer)
    buildToolsVersion(Versions.buildToolsVer)

    defaultConfig {
        applicationId = "com.ng.planetarymanager"
        minSdkVersion(Versions.sdkMinReleaseVer)
        targetSdkVersion(Versions.sdkTargetVer)
        versionCode = Versions.appVersionCode
        versionName = Versions.appVersionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isDebuggable = true
        }
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(project(":SharedCode"))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Deps.kotlinStdlib)
    implementation(Deps.appCompat)
    implementation(Deps.ktx)
    implementation(Deps.constraintlayout)
    implementation(Deps.bottomNav)
}
