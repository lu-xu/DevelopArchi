package com.example.myarchi.ui

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.myarchi.R
import com.example.base.ui.BaseActivity
import com.example.myarchi.databinding.ActivityMainBinding
import com.example.pay.PayActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
        mBinding.text = viewModel.getTestText()
        mBinding.handler = handler

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fl_container, MainFragment())
                .commitAllowingStateLoss()
        }
    }

    override fun provideContentView() = R.layout.activity_main

    interface ClickHandler{
        fun clickPay()
    }

    private val handler = object :ClickHandler{
        override fun clickPay() {
           startActivity(Intent(this@MainActivity,PayActivity::class.java))
        }
    }
}
