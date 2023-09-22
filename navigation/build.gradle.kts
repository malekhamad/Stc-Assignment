plugins {
    id(Plugins.library)
    id(Plugins.kotlinAndroid)
    id(Plugins.safeArgs)
}

android {
    namespace = "com.stc.navigation"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = AppConfigs.jvmTarget
    }
}

dependencies {

    implementation(Deps.coreKtx)
    implementation(Deps.appCompat)
    implementation(Deps.material)
    implementation(Deps.navigationFragment)
    implementation(Deps.navigationUi)

    testImplementation(Deps.jUnit)
    androidTestImplementation(Deps.extJUnit)
    androidTestImplementation(Deps.espresso)
}