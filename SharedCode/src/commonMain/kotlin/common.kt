package com.ng.planetarymanager

expect fun platform(): Platform

enum class Platform(val platformName: String) {
    ANDROID("Android"), IOS("IOS")
}

fun getPlatformNameValue(): String {
    return "Run in ${platform().platformName}"
}