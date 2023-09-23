package com.stc.data.di

import android.content.Context
import androidx.room.Room
import com.stc.data.BuildConfig
import com.stc.data.database.MoviesDatabase
import com.stc.data.database.dao.MoviesDao
import com.stc.data.database.dao.RemoteKeysDao
import com.stc.data.network.MovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    @Singleton
    @Provides
    fun provideRetrofitInstance(): MovieService =
        Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieService::class.java)

    @Singleton
    @Provides
    fun provideMovieDatabase(@ApplicationContext context: Context): MoviesDatabase =
        Room
            .databaseBuilder(context, MoviesDatabase::class.java, "movies_database")
            .build()

    @Singleton
    @Provides
    fun provideMoviesDao(moviesDatabase: MoviesDatabase): MoviesDao = moviesDatabase.getMoviesDao()

    @Singleton
    @Provides
    fun provideRemoteKeysDao(moviesDatabase: MoviesDatabase): RemoteKeysDao = moviesDatabase.getRemoteKeysDao()
}