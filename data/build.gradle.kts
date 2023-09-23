plugins {
    id(Plugins.library)
    id(Plugins.kotlinAndroid)
    id(Plugins.daggerHilt)
    kotlin(Plugins.kapt)

}

android {
    namespace = "com.stc.data"
    compileSdk = AppConfigs.compileSdk

    defaultConfig {
        minSdk = AppConfigs.minSdk

        buildConfigField("String", "BASE_URL", "\"https://api.themoviedb.org/3/\"")
        buildConfigField("String", "API_KEY", "\"8399fc03f5e0bc2e9e3318764f8b2043\"")


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
        buildConfig = true
        dataBinding= true
        viewBinding = true
    }

}

dependencies {

    implementation(project(Modules.Domain))

    implementation(Deps.coreKtx)
    implementation(Deps.appCompat)

    implementation(Deps.daggerHilt)

    implementation (Deps.retofit)
    implementation (Deps.retrofitGsonConverter)
    implementation (Deps.okhttpLoggingInterceptor)

    implementation(Deps.roomKtx)
    implementation(Deps.roomRuntime)
    implementation(Deps.roomPaging)
    implementation(Deps.gson)

    kapt(Deps.daggerHiltCompiler)
    kapt(Deps.roomCompiler)

    testImplementation(Deps.jUnit)
    androidTestImplementation(Deps.extJUnit)
    androidTestImplementation(Deps.espresso)
}

kapt {
    correctErrorTypes = true
}