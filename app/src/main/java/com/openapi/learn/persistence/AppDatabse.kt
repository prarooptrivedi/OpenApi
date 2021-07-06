package com.openapi.learn.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.openapi.learn.models.AccountProperties
import com.openapi.learn.models.AuthToken


@Database(entities = [AuthToken::class,AccountProperties::class],version = 1)
abstract class AppDatabse:RoomDatabase(){
    abstract fun getAuthTokenDao():AuthTokenDao

    abstract fun getAccountPropertiesDao():AccountPropertiesDao

    companion object{
        const val DATABASE_NAME="app_db"
    }

}