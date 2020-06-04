package com.example.user

import com.example.base.ConverseUtil

class UserTest {
    companion object{
        fun userTestConvert(source:String):String{
            return "UserTest: ${ConverseUtil.convertUpperCase(source)}"
        }
    }
}