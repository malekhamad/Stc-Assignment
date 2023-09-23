package com.stc.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.stc.data.database.dao.MoviesDao
import com.stc.data.database.dao.RemoteKeysDao
import com.stc.data.model.discover.Movie
import com.stc.data.model.discover.RemoteKeys

@Database(
    entities = [Movie::class, RemoteKeys::class],
    version = 1,
)
abstract class MoviesDatabase: RoomDatabase() {
    abstract fun getMoviesDao(): MoviesDao
    abstract fun getRemoteKeysDao(): RemoteKeysDao
}