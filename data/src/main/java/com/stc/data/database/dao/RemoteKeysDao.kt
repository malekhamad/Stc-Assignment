package com.stc.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.stc.data.model.discover.RemoteKeys

@Dao
interface RemoteKeysDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(remoteKey: List<RemoteKeys>)

    @Query("SELECT * FROM remote_key WHERE movie_id = :id")
    fun getRemoteKeyByMovieID(id: Int): RemoteKeys?

    @Query("DELETE FROM remote_key")
    fun clearRemoteKeys()

}