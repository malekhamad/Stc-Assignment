object Deps {

    // Android
    val coreKtx by lazy {"androidx.core:core-ktx:${Versions.coreKtx}"}
    val appCompat by lazy {"androidx.appcompat:appcompat:${Versions.appCompat}"}
    val material by lazy{"com.google.android.material:material:${Versions.material}"}
    val constraintLayout by lazy {"androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"}
    val liveData by lazy {"androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycle}"}
    val gson by lazy {"com.google.code.gson:gson:${Versions.gson}"}

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

    // Pagging
    val paging by lazy {"androidx.paging:paging-runtime-ktx:${Versions.paging}"}

    // Room
    val roomRuntime by lazy {"androidx.room:room-runtime:${Versions.room}"}
    val roomKtx by lazy {"androidx.room:room-ktx:${Versions.room}"}
    val roomPaging by lazy {"androidx.room:room-paging:${Versions.room}"}
    val roomCoroutines by lazy {"androidx.room:room-coroutines:${Versions.room}"}
    val roomCompiler by lazy {"androidx.room:room-compiler:${Versions.room}"}



    // Testing
    val jUnit by lazy {"junit:junit:${Versions.jUnit}"}
    val extJUnit by lazy {"androidx.test.ext:junit:${Versions.extJUnit}"}
    val espresso by lazy {"androidx.test.espresso:espresso-core:${Versions.espresso}"}

}