package com.example.myarchi.di

import android.app.Application
import com.example.myarchi.base.BaseApplication
import com.example.pay.module.PayModule
import com.example.user.module.UserModule
import dagger.Binds
import dagger.Module

@Module(
    includes = [
        BaseModule::class,
        UserModule::class,
        PayModule::class,
        AppActivityModule::class
    ]
)
abstract class AppModule {

    @Binds
    abstract fun bindApplication(baseApplication: BaseApplication): Application

}
