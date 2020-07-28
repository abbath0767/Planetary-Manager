buildscript {
    repositories {
        google()
        jcenter()
        maven { setUrl("https://kotlin.bintray.com/kotlinx") }
    }
    dependencies {
        classpath(BuildDeps.kotlin)
        classpath(BuildDeps.gradle)
        classpath(BuildDeps.sqldelight)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { setUrl("https://kotlin.bintray.com/kotlinx") }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}