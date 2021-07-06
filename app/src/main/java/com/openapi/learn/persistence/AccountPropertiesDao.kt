package com.openapi.learn.persistence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.openapi.learn.models.AccountProperties


@Dao
interface AccountPropertiesDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAndReplace(accountProperties: AccountProperties):Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertOrIgnore(accountProperties: AccountProperties):Long

    @Query("Select * FROM account_properties WHERE pk=:pk")
    fun SearchByPk(pk:Int):AccountProperties?

    @Query("Select * FROM account_properties WHERE email=:email")
    fun SearchByEmail(email:String):AccountProperties?

}