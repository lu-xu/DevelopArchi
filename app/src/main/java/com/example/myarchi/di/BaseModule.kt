package com.example.myarchi.di

import androidx.lifecycle.ViewModelProvider
import com.example.base.di.vm.ViewModelFactory

import dagger.Binds
import dagger.Module

@Module
abstract class BaseModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
