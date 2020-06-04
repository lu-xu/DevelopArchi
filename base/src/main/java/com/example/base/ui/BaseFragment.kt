package com.example.base.ui

import android.content.Context
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.example.base.databinding.DataBindingFragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

abstract class BaseFragment<V : ViewDataBinding> : DataBindingFragment<V>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}