package com.stc.domain.repository

import androidx.paging.PagingData
import com.stc.domain.entity.discover.MovieEntity
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun getPopularMovies() : Flow<PagingData<MovieEntity>>
}