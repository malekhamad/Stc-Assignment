package com.stc.data.di

import com.stc.data.repository.MovieRepositoryImpl
import com.stc.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface  RepositoryModule {

    @Singleton
    @Binds
    fun bindMovieRepository(
        movieRepositoryImpl: MovieRepositoryImpl
    ): MovieRepository

}