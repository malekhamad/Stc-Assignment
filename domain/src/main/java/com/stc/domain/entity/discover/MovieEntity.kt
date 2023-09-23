package com.stc.domain.entity.discover

data class MovieEntity (
    val id: Int,
    val ogTitle: String,
    val overview: String,
    val popularity: Double,
    val posterPath: String?,
    val releaseDate: String,
    val title: String,
    var page: Int,
)