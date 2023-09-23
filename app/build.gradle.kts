plugins {
    id(Plugins.application)
    id(Plugins.kotlinAndroid)
    id(Plugins.safeArgs)
    id(Plugins.daggerHilt)
    kotlin(Plugins.kapt)

}

android {
    namespace = AppConfigs.applicationID
    compileSdk = AppConfigs.compileSdk

    defaultConfig {
        applicationId = AppConfigs.applicationID
        minSdk = AppConfigs.minSdk
        targetSdk = AppConfigs.targetSdk
        versionCode = AppConfigs.versionCode
        versionName = AppConfigs.versionName

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
    buildFeatures{
        dataBinding= true
        viewBinding = true
    }
}

dependencies {

    implementation(project(Modules.Domain))
    implementation(project(Modules.Data))
    implementation(project(Modules.Movie))

    implementation(Deps.coreKtx)
    implementation(Deps.appCompat)
    implementation(Deps.material)
    implementation(Deps.constraintLayout)
    implementation(Deps.daggerHilt)
    implementation(Deps.navigationFragment)
    implementation(Deps.navigationUi)

    kapt(Deps.daggerHiltCompiler)

    testImplementation(Deps.jUnit)
    androidTestImplementation(Deps.extJUnit)
    androidTestImplementation(Deps.espresso)
}
kapt {
    correctErrorTypes = true
}