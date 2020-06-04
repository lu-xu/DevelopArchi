package com.example.base.di

import android.content.Context
import androidx.fragment.app.FragmentActivity
import dagger.Binds
import dagger.Module

@Module
abstract class ActivitySubComponentModule<T : FragmentActivity> {
    @Binds
    abstract fun bindFragmentActivity(t: T): FragmentActivity

    @Binds
    abstract fun bindContext(t: T): Context
}
