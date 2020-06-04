package com.example.myarchi.di

import com.example.myarchi.module.MainActivityModule
import dagger.Module

@Module(
    includes = [
       MainActivityModule::class
    ]
)
class AppActivityModule {

//    @Provides
//    @Singleton
//    fun provideAppApiService(client: OkHttpClient): AppApiService {
//        return RetrofitUtil.createRetrofit(API_HOST, client).create(AppApiService::class.java)
//    }
}
