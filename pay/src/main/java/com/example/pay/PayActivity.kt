package com.example.pay

import android.os.Bundle
import com.example.base.inteface.IUserManager
import com.example.base.ui.BaseActivity
import com.example.pay.databinding.ActPayBinding
import javax.inject.Inject

class PayActivity : BaseActivity<ActPayBinding>() {
    override fun provideContentView(): Int {
        return R.layout.act_pay
    }

    @Inject
    lateinit var userManager: IUserManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding.text = "---->${userManager.isLogin}${userManager.getUserId()}"
    }
}