//import io.sentry.android.gradle.extensions.InstrumentationFeature

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
//    id ("io.sentry.android.gradle") version "3.12.0"
}

android {
    signingConfigs {
        create("release") {
            storeFile = file("C:\\Users\\U550606\\AndroidStudioProjects\\MyApplication2Key.jks")
            storePassword = "password"
            keyAlias = "key0"
            keyPassword = "password"
        }
    }
    namespace = "com.example.myapplication2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication2"
//        minSdk = 24
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("release")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}


//sentry {
//    includeProguardMapping.set(true)
//    autoUploadProguardMapping.set(true)
//    experimentalGuardsquareSupport.set(false)
//    uploadNativeSymbols.set(false)
//    autoUploadNativeSymbols.set(true)
//    includeNativeSources.set(false)
//    includeSourceContext.set(false)
//    tracingInstrumentation {
//        enabled.set(true)
//        features.set(setOf(InstrumentationFeature.DATABASE, InstrumentationFeature.FILE_IO, InstrumentationFeature.OKHTTP, InstrumentationFeature.COMPOSE))
//    }
//    autoInstallation {
//        enabled.set(true)
//        sentryVersion.set("6.30.0")
//    }
//    includeDependenciesReport.set(true)
//
////    ignoredBuildTypes.set(setOf("release"))
////    ignoredFlavors.set(setOf("production"))
////    ignoredVariants.set(setOf("productionRelease"))
//
//}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.1")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    val acraVersion = "5.9.3"
    implementation("ch.acra:acra-core:$acraVersion")
    implementation("ch.acra:acra-http:$acraVersion")
    implementation("ch.acra:acra-notification:$acraVersion")
    implementation("ch.acra:acra-toast:$acraVersion")

    implementation("com.github.anrwatchdog:anrwatchdog:1.4.0")

    //-----For Sentry
//    implementation("io.sentry:sentry-android-gradle-plugin:3.12.0") -> ini gak bisa karna io.sentry.Sentrynya gk kepanggil

    // https://mvnrepository.com/artifact/com.guardsquare/proguard-gradle
//    implementation("com.guardsquare:proguard-gradle:7.3.0")
}

