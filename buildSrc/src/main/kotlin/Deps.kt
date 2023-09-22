object Deps {

    // Android
    val coreKtx by lazy {"androidx.core:core-ktx:${Versions.coreKtx}"}
    val appCompat by lazy {"androidx.appcompat:appcompat:${Versions.appCompat}"}
    val material by lazy{"com.google.android.material:material:${Versions.material}"}
    val constraintLayout by lazy {"androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"}
    val liveData by lazy {"androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycle}"}

    // DaggerHilt

    val daggerHilt by lazy {"com.google.dagger:hilt-android:${Versions.daggerHilt}"}
    val daggerHiltCompiler by lazy {"com.google.dagger:hilt-android-compiler:${Versions.daggerHilt}"}

    // Navigation

    val navigationFragment by lazy {"androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"}
    val navigationUi by lazy {"androidx.navigation:navigation-ui-ktx:${Versions.navigation}"}

    // Retrofit

    val retofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val retrofitGsonConverter by lazy {"com.squareup.retrofit2:converter-gson:${Versions.retrofit}"}
    val okhttpLoggingInterceptor by lazy {"com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"}

    // Testing

    val jUnit by lazy {"junit:junit:${Versions.jUnit}"}
    val extJUnit by lazy {"androidx.test.ext:junit:${Versions.extJUnit}"}
    val espresso by lazy {"androidx.test.espresso:espresso-core:${Versions.espresso}"}

}