package com.example.user.impl

import com.example.base.inteface.IUserManager

internal class UserManager:IUserManager {
    override val isLogin: Boolean
        get() = true

    override fun getUserId(): String {
        return "${Math.random()}"
    }
}