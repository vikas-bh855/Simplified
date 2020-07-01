
plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(Versions.COMPILE_SDK)
    defaultConfig {
        applicationId = "com.architecture.simplified"
        minSdkVersion(Versions.MIN_SDK)
        targetSdkVersion(Versions.TARGET_SDK)
        versionCode = Versions.versionCodeMobile
        versionName = Versions.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

    }
    buildFeatures {
        dataBinding = true
    }


    lintOptions {
        // Eliminates UnusedResources false positives for resources used in DataBinding layouts
        isCheckGeneratedSources = true
        // Running lint over the debug variant is enough
        isCheckReleaseBuilds = false
        // See lint.xml for rules configuration
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        val options = this as org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
        options.jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("${Libs.CORE}:${Versions.CORE}")
    implementation("${Libs.APPCOMPAT}:${Versions.APPCOMPAT}")
    implementation("${Libs.MATERIAL}:${Versions.APPCOMPAT}")
    implementation("${Libs.NAVIGATION_UI_KTX}:${Versions.NAVIGATION}")
    implementation("${Libs.NAVIGATION_FRAGMENT_KTX}:${Versions.NAVIGATION}")
    implementation("${Libs.CONSTRAINT_LAYOUT}:${Versions.CONSTRAINTLAYOUT}")

    implementation("${Libs.KOTLIN_STDLIB}:${Versions.KOTLIN}")

    implementation("${Libs.LIFECYCLE_LIVE_DATA_KTX}:${Versions.LIFECYCLE}")
    kapt("${Libs.LIFECYCLE_COMPILER}:${Versions.LIFECYCLE}")

    implementation("${Libs.HILT_ANDROID}:${Versions.HILT}")
    kapt("${Libs.HILT_COMPILER}:${Versions.HILT}")

    implementation("${Libs.HILT_VIEWMODEL}:${Versions.hiltJetPack}")


    testImplementation("${Libs.JUNIT}:${Versions.JUNIT}")
    androidTestImplementation("${Libs.ESPRESSO}:${Versions.ESPRESSO}")
    androidTestImplementation("${Libs.EXJUNIT}:${Versions.EXJUNIT}")
    //implementation="androidx.constraintlayout:constraintlayout:1.1.3"
}