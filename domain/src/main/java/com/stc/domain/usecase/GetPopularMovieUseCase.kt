package com.stc.domain.usecase

import androidx.paging.PagingData
import com.stc.domain.entity.discover.MovieEntity
import com.stc.domain.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class GetPopularMovieUseCase(private val movieRepository: MovieRepository) {
     operator fun invoke(): Flow<PagingData<MovieEntity>> = movieRepository.getPopularMovies()
          .flowOn(Dispatchers.IO)

}