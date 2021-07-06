package com.openapi.learn.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.openapi.learn.R


class LauncherFragment : Fragment() {
    var register:TextView?=null
    var login:TextView?=null
    var forgot_password:TextView?=null
    var focusable_view:View?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_launcher, container, false)
        register=v.findViewById(R.id.register)
        login=v.findViewById(R.id.login)
        forgot_password=v.findViewById(R.id.forgot_password)
        focusable_view=v.findViewById(R.id.focusable_view)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        register!!.setOnClickListener {
            navRegistration()
        }
        login!!.setOnClickListener {
            navLogin()
        }
        forgot_password!!.setOnClickListener {
            navForgetPassword()
        }
        focusable_view!!.requestFocus()
    }

    private fun navForgetPassword() {
        findNavController().navigate(R.id.action_launcherFragment_to_forgetPasswordFragment)
    }

    private fun navLogin() {
        findNavController().navigate(R.id.action_launcherFragment_to_loginFragment)
    }

    private fun navRegistration() {
    findNavController().navigate(R.id.action_launcherFragment_to_registerFragment)
    }
}