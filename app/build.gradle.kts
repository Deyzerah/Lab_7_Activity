plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.lab_7_activity"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.lab_7_activity"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.firestore)
    implementation(libs.ext.junit)
    implementation(libs.espresso.core)

    testImplementation(libs.junit)

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.rules)

    androidTestImplementation("androidx.test:core-ktx:1.7.0")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")

}