package com.stc.data.network

import com.stc.data.BuildConfig
import com.stc.data.model.discover.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface MovieService {

        @GET("movie/popular?api_key=${BuildConfig.API_KEY}&language=en-US")
        suspend fun getPopularMovies(
            @Query("page") page: Int
        ): MovieResponse
}