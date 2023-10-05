plugins {
    id("com.android.application")
    id("proguard")
    id("org.jetbrains.kotlin.android")
//    id ("io.sentry.android.gradle") version "3.12.0"
}

android {
    namespace = "com.example.myapplication2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication2"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
//            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
        release {
            isMinifyEnabled = false
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

    val acraVersion = "5.8.4"
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

