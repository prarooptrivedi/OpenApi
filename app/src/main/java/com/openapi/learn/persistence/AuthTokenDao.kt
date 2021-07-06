package com.openapi.learn.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.openapi.learn.models.AuthToken

@Dao

interface AuthTokenDao{
@Insert(onConflict = OnConflictStrategy.REPLACE)
fun insert(auth: AuthToken):Long

@Query("UPDATE auth_token SET token=null WHERE account_pk=:pk")
fun nullifyToken(pk:Int):Int
}