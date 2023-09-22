plugins {
    id(Plugins.library)
    id(Plugins.kotlinAndroid)
    kotlin(Plugins.kapt)


}

android {
    namespace = "com.stc.core"
    compileSdk = AppConfigs.compileSdk

    defaultConfig {
        minSdk = AppConfigs.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = AppConfigs.jvmCompatability
        sourceCompatibility = AppConfigs.jvmCompatability
    }
    kotlinOptions {
        jvmTarget = AppConfigs.jvmTarget
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true

    }
}

dependencies {

    implementation("${Deps.coreKtx}:${Versions.coreKtx}")
    implementation("${Deps.appCompat}:${Versions.appCompat}")
    implementation("${Deps.material}:${Versions.material}")


    testImplementation(Deps.jUnit)
    androidTestImplementation(Deps.extJUnit)
    androidTestImplementation(Deps.espresso)}

kapt {
    correctErrorTypes = true
}