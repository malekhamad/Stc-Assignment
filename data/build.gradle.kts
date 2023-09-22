plugins {
    id(Plugins.application)
    id(Plugins.kotlinAndroid)
    id(Plugins.daggerHilt)
    kotlin(Plugins.kapt)

}

android {
    namespace = "com.stc.data"
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
        sourceCompatibility = AppConfigs.jvmCompatability
        sourceCompatibility = AppConfigs.jvmCompatability
    }
    kotlinOptions {
        jvmTarget = AppConfigs.jvmTarget
    }
}

dependencies {

    implementation("${Deps.coreKtx}:${Versions.coreKtx}")
    implementation("${Deps.appCompat}:${Versions.appCompat}")
    implementation(Deps.daggerHilt)

    kapt(Deps.daggerHiltCompiler)


    testImplementation(Deps.jUnit)
    androidTestImplementation(Deps.extJUnit)
    androidTestImplementation(Deps.espresso)
}

kapt {
    correctErrorTypes = true
}