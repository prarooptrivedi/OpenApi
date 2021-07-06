package com.openapi.learn.ui.auth

import android.view.ViewManager
import androidx.lifecycle.ViewModel
import com.openapi.learn.repository.auth.AuthRepository

class AuthViewModel
constructor(
    val authRepository: AuthRepository
):ViewModel()
{

}