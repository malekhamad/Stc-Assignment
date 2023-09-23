package com.stc.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.map
import com.stc.data.data_source.MovieRemoteDataSource
import com.stc.data.database.MoviesDatabase
import com.stc.data.mapper.toEntity
import com.stc.data.network.MovieService
import com.stc.domain.entity.discover.MovieEntity
import com.stc.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val moviesDatabase: MoviesDatabase
)
    : MovieRepository{
     val PAGE_SIZE = 20

    @ExperimentalPagingApi
    override fun getPopularMovies(): Flow<PagingData<MovieEntity>> {
       return  Pager(
           config = PagingConfig(
               pageSize = PAGE_SIZE,
               prefetchDistance = 2,
               initialLoadSize = PAGE_SIZE,
           ),

           remoteMediator = movieRemoteDataSource,
           initialKey = 1,
                   pagingSourceFactory = {
               moviesDatabase.getMoviesDao().getMovies()
           },
       ).flow.map { pageData ->
           pageData.map { movie->
               movie.toEntity()
           }

       }
    }
}