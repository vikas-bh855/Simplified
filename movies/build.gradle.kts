plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin")
    kotlin("plugin.serialization") version "1.4.10"
}

android {
    compileSdkVersion(Versions.COMPILE_SDK)
    defaultConfig {
        applicationId = "com.retrofit.movies"
        minSdkVersion(Versions.MIN_SDK)
        targetSdkVersion(Versions.TARGET_SDK)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug")
        {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        val options = this as org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
        options.jvmTarget = "1.8"
    }

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    api(platform(project(":depconstraint")))
    kapt(platform(project(":depconstraint")))

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Libs.CORE)
    implementation(Libs.APPCOMPAT)
    implementation(Libs.MATERIAL)
    implementation(Libs.NAVIGATION_UI_KTX)
    implementation(Libs.NAVIGATION_FRAGMENT_KTX)
    implementation(Libs.CONSTRAINT_LAYOUT)
    implementation(Libs.KOTLIN_STDLIB)
    implementation(Libs.LIFECYCLE_LIVE_DATA_KTX)

    implementation(Libs.COIL)

    implementation(Libs.INK_PAGE_INDICATOR)
    implementation(Libs.RETROFIT)
    implementation(Libs.GSON)
    implementation(Libs.KOTLIN_SERIALIZATION)
    kapt(Libs.LIFECYCLE_COMPILER)

    implementation(Libs.HILT_ANDROID)
    implementation(Libs.HILT_VIEWMODEL)
    implementation(Libs.DYNAMICANIMATION)

    kapt(Libs.HILT_COMPILER)
    kapt(Libs.ANDROIDX_HILT_COMPILER)


    testImplementation(Libs.JUNIT)
    androidTestImplementation(Libs.ESPRESSO)
    androidTestImplementation(Libs.EXJUNIT)

}