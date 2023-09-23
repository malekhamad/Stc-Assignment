plugins {
    id(Plugins.library)
    id(Plugins.kotlinAndroid)
    kotlin(Plugins.kapt)
    id(Plugins.safeArgs)
    id(Plugins.daggerHilt)
}

android {
    namespace = "com.stc.movie"
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

    api(project(Modules.Navigation))
    implementation(project(Modules.Domain))
    implementation(project(Modules.Core))

    implementation(Deps.coreKtx)
    implementation(Deps.appCompat)
    implementation(Deps.material)
    implementation (Deps.daggerHilt)
    implementation(Deps.navigationFragment)
    implementation(Deps.navigationUi)
    implementation(Deps.liveData)
    implementation(Deps.paging)

    kapt (Deps.daggerHiltCompiler)

    testImplementation(Deps.jUnit)
    androidTestImplementation(Deps.extJUnit)
    androidTestImplementation(Deps.espresso)
}
kapt {
    correctErrorTypes = true
}

hilt {
    enableExperimentalClasspathAggregation = true
}