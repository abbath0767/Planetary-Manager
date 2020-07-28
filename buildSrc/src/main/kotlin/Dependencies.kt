object Versions {
    const val kotlin_version = "1.3.71"
    const val gradle_plugin_version = "4.0.0"
    const val sdkTargetVer = 29
    const val buildToolsVer = "29.0.3"
    const val sdkMinReleaseVer = 21
    const val appVersionCode = 1
    const val appVersionName = "0.0.1-aplpha"
    const val axVersion = "1.1.0"
    const val sqlDelight = "1.4.0"
}

object Groups {
    const val kotlin = "org.jetbrains.kotlin"
    const val ax = "androidx"
}

object BuildDeps {
    const val kotlin = "${Groups.kotlin}:kotlin-gradle-plugin:${Versions.kotlin_version}"
    const val gradle = "com.android.tools.build:gradle:${Versions.gradle_plugin_version}"
    const val sqldelight = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
}

object Deps {
    const val kotlinStdlib = "${Groups.kotlin}:kotlin-stdlib:${Versions.kotlin_version}"
    const val ktx = "${Groups.ax}.core:core-ktx:1.2.0"
    const val appCompat = "${Groups.ax}.appcompat:appcompat:${Versions.axVersion}"
    const val constraintlayout = "${Groups.ax}.constraintlayout:constraintlayout:1.1.3"
    const val bottomNav = "com.aurelhubert:ahbottomnavigation:2.3.4"
}