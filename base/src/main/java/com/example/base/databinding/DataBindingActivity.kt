package com.example.base.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding

/**
 * DataBinding Activity的基类
 *
 * @param V ViewDataBinding范型
 * */
abstract class DataBindingActivity<V : ViewDataBinding> : AppCompatActivity() {
    protected lateinit var mBinding: V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = provideContentViewBinding()
        mBinding.lifecycleOwner = this
    }

    /**
     * 提供[V]的实体对象
     *
     * @return 返回[V]的实体对象
     * */
    abstract fun provideContentViewBinding(): V
}