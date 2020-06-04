package com.example.pay

import com.example.base.inteface.IUserManager
import javax.inject.Inject

class PayTest {

        @Inject
        lateinit var userManager: IUserManager
        fun payTest() {
//            println("${userManager.isLogin}")
        }


    fun text() {
    }
}