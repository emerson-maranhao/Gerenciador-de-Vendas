package com.example.gerenciadordevendas.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.gerenciadordevendas.data.db.dao.ClientDAO
import com.example.gerenciadordevendas.data.db.entity.ClientEntity

@Database(entities = [ClientEntity::class], version = 1)
abstract class AppDataBase:RoomDatabase() {
    abstract val ClientDAO:ClientDAO
    companion object{
        @Volatile
        private var INSTANCE:AppDataBase?=null
        fun getInstance(context: Context): AppDataBase{
            synchronized(this){
                var instance:AppDataBase?= INSTANCE
                if (instance==null){
                    instance=Room.databaseBuilder(
                        context, AppDataBase::class.java,
                        "app_database"
                    ).build()
                }
                return instance
            }

        }
    }
}