package com.stc.domain.di


import com.stc.domain.repository.MovieRepository
import com.stc.domain.usecase.GetPopularMovieUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MovieUseCase {

    @Singleton
    @Provides
    fun providePopularMovieUseCase(movieRepository: MovieRepository): GetPopularMovieUseCase {
        return GetPopularMovieUseCase(movieRepository)
    }
}