//import io.sentry.android.gradle.extensions.InstrumentationFeature
//import io.sentry.android.gradle.instrumentation.logcat.LogcatLevel
import com.google.firebase.crashlytics.buildtools.gradle.CrashlyticsExtension

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    //---- Sentry plugin
//    id("io.sentry.android.gradle") version "3.12.0"
    //---- Crashlytics plugin
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
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
        debug {
            isMinifyEnabled= false
        }
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("release")
            configure<CrashlyticsExtension> { mappingFileUploadEnabled = true }
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
//    includeProguardMapping.set(true) //-> generate a UUID & uploading the mapping to Sentry
//    autoUploadProguardMapping.set(true) //-> auto-upload the mapping file to Sentry
//    experimentalGuardsquareSupport.set(false) // (tools integration)-> plugin will try to consume and upload the mapping file produced by Dexguard and External Proguard.
//    uploadNativeSymbols.set(false) //-> utomatic configuration of Native Symbols for Sentry
//    autoUploadNativeSymbols.set(true) //-> lanjutan diatas
//    includeNativeSources.set(false) // -> has an effect only when [uploadNativeSymbols] is enabled.
//    includeSourceContext.set(false) // -> Generates a JVM (Java, Kotlin, etc.) source bundle and uploads your source code to Sentry. This enables source context, allowing you to see your source
//    tracingInstrumentation {
//        enabled.set(true)
//        features.set(setOf(InstrumentationFeature.DATABASE, InstrumentationFeature.FILE_IO, InstrumentationFeature.OKHTTP, InstrumentationFeature.COMPOSE))
//        logcat {
//            enabled = true
//            minLevel = LogcatLevel.WARNING
//        }
//    }
//    autoInstallation {
//        enabled.set(true)
//        sentryVersion.set("6.31.0")
//    }
//    includeDependenciesReport.set(true)

//    ignoredBuildTypes.set(setOf("release"))
//    ignoredFlavors.set(setOf("production"))
//    ignoredVariants.set(setOf("productionRelease"))

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
    //-----For Sentry (gk kepake udh pake plugin)
//    implementation("io.sentry:sentry-android-gradle-plugin:3.13.0")
//    implementation("io.sentry:sentry-android-gradle-plugin:3.12.0") -> ini gak bisa karna io.sentry.Sentrynya gk kepanggil

    //-----Proguard
//    implementation("com.guardsquare:proguard-gradle:7.3.0") -> ini gak bisa sama aja gk dapet plluginnya

    //-----Firebase Crashlytics
    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
    implementation("com.google.firebase:firebase-crashlytics-ktx")
    implementation("com.google.firebase:firebase-analytics-ktx")
}

