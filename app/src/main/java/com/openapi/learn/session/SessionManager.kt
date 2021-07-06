package com.openapi.learn.session

import android.app.Application
import com.openapi.learn.persistence.AuthTokenDao

class SessionManager
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
)