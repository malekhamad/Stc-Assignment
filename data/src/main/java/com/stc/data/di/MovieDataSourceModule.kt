package com.stc.data.di

import com.stc.data.data_source.MovieRemoteDataSource
import com.stc.data.database.MoviesDatabase
import com.stc.data.network.MovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MovieDataSourceModule {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(
        movieService: MovieService,
        moviesDatabase: MoviesDatabase,
    ) = MovieRemoteDataSource(movieService, moviesDatabase)
}