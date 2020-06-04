package com.example.myarchi.di

import com.example.myarchi.base.BaseApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class
    ]
)
@Singleton
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<BaseApplication>
}
