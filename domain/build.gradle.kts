plugins {
    id(Plugins.library)
    id(Plugins.kotlinAndroid)
    id(Plugins.daggerHilt)
    kotlin(Plugins.kapt)
}

android {
    namespace = "com.stc.domain"
    compileSdk = AppConfigs.compileSdk

    defaultConfig {
        minSdk = AppConfigs.minSdk

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
        sourceCompatibility = AppConfigs.jamCompatibility
        targetCompatibility = AppConfigs.jamCompatibility
    }
    kotlinOptions {
        jvmTarget = AppConfigs.jvmTarget
    }
    buildFeatures {
        dataBinding= true
        viewBinding = true
    }

}

dependencies {

    implementation(Deps.coreKtx)
    implementation(Deps.appCompat)
    implementation(Deps.daggerHilt)
    implementation(Deps.paging)

    kapt(Deps.daggerHiltCompiler)

    testImplementation(Deps.jUnit)
    androidTestImplementation(Deps.extJUnit)
    androidTestImplementation(Deps.espresso)
}
kapt {
    correctErrorTypes = true
}