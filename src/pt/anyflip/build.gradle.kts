plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "eu.kanade.tachiyomi.extension.pt.anyflip"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
    }
}

dependencies {
    implementation(project(":core"))
}
