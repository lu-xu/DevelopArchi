package com.example.pay.module

import com.example.base.di.ActivitySubComponentModule
import com.example.base.di.scope.ActivityScope
import com.example.pay.PayActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class PayActivityModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributePayActivity(): PayActivity

    @Module
    abstract class PayActivitySubComponentModule : ActivitySubComponentModule<PayActivity>()
}