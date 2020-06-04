package com.example.base.databinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * DataBinding Fragment基类
 *
 * @param V ViewDataBinding范型
 * */
abstract class DataBindingFragment<V : ViewDataBinding> : Fragment() {
    protected lateinit var mBinding: V

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = DataBindingUtil.inflate(inflater, provideContentView(), container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding.lifecycleOwner = viewLifecycleOwner
    }

    /**
     * 提供页面layout资源id
     *
     * @return layout资源id
     * */
    @LayoutRes
    abstract fun provideContentView(): Int
}