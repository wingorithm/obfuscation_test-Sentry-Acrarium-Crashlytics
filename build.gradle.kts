// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()       // For the Android Gradle plugin.
        mavenCentral() // For the ProGuard Gradle Plugin and anything else.
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.2")    // The Android Gradle plugin.
        classpath("com.guardsquare:proguard-gradle:7.3.0")  // The ProGuard Gradle plugin.
    }
}

plugins {
//    id("com.android.application") version "8.2.0" apply false
    id("com.android.application") version "8.1.2" apply false
//    id("com.android.library") version "8.1.0" apply false
//    Check disini -> http://bcaartifactory.intra.bca.co.id:8080/artifactory/maven.google.com/com/android/application/com.android.application.gradle.plugin/
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
