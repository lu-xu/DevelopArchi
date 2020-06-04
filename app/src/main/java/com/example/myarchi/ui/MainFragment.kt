package com.example.myarchi.ui

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.myarchi.R
import com.example.base.ui.BaseFragment
import com.example.myarchi.databinding.FragMainBinding

class MainFragment : BaseFragment<FragMainBinding>() {

    private lateinit var viewModel: MainActivityViewModel
    override fun provideContentView() = R.layout.frag_main
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
        mBinding.text = viewModel.getFragmentTestText()
    }
}