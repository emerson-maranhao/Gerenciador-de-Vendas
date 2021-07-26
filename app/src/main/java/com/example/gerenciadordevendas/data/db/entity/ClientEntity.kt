package com.example.gerenciadordevendas.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "client")
data class ClientEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val email: String
)