package com.example.firstapp.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_data")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String,
    val lastName: String,
    val Number: Int

)