package com.stc.data.mapper

import com.stc.data.model.discover.Movie
import com.stc.domain.entity.discover.MovieEntity


fun Movie.toEntity() = MovieEntity(
    id = id,
   ogTitle = ogTitle,
    overview = overview,
    popularity = popularity,
    posterPath = posterPath,
    releaseDate = releaseDate,
    title = title,
    page = page
)