package com.stc.movie.di

import com.stc.movie.adapter.MoviePagingAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
class MovieModule {

  @Provides
  fun provideMoviePagingAdapter() = MoviePagingAdapter()
}