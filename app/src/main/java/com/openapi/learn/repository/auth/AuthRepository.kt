package com.openapi.learn.repository.auth

import com.openapi.learn.api.auth.OpenApiAuthService
import com.openapi.learn.persistence.AccountPropertiesDao
import com.openapi.learn.persistence.AuthTokenDao
import com.openapi.learn.session.SessionManager

class AuthRepository
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
)