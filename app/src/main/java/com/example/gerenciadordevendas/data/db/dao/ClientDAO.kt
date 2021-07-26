package com.example.gerenciadordevendas.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.gerenciadordevendas.data.db.entity.ClientEntity

@Dao
interface ClientDAO {

    @Insert
    suspend fun insert (client:ClientEntity):Long

    @Update fun update (client: ClientEntity)

    @Query("DELETE FROM client WHERE id=:id")
    suspend fun delete (id:Long)

    @Query("SELECT * FROM client")
    fun getAll(): LiveData<List<ClientEntity>>

}