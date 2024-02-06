plugins {
    id("com.android.application")
}

android {
    namespace = "com.dckrOff.learnroomdatabase"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.dckrOff.learnroomdatabase"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")

    // Room components
    implementation("androidx.room:room-runtime:2.6.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")
    androidTestImplementation("androidx.room:room-testing:2.6.1")

    // Lifecycle components
    implementation("androidx.lifecycle:lifecycle-viewmodel:2.7.0")
    implementation("androidx.lifecycle:lifecycle-livedata:2.7.0")
    implementation("androidx.lifecycle:lifecycle-common-java8:2.7.0")

    // UI
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.11.0")

    // Testing
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.arch.core:core-testing:2.2.0")
//    androidTestImplementation("androidx.test.espresso:espresso-core:$rootProject.espressoVersion") {
//        exclude group : 'com.android.support', module: 'support-annotations'
//    }
//    androidTestImplementation("androidx.test.ext:junit:4.13.2")
}