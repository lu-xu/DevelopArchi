package com.example.myarchi.ui

import androidx.lifecycle.ViewModel
import com.example.pay.PayTest
import com.example.user.UserTest
import javax.inject.Inject

class MainActivityViewModel @Inject constructor() : ViewModel() {

    fun getTestText():String{
        return "this is a test ${PayTest().payTest()}"
    }
    fun getFragmentTestText():String{
        return "this is a test-fragment ${UserTest.userTestConvert("qwertyui")}"
    }
}