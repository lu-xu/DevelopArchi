package com.example.user.module

import com.example.base.inteface.IUserManager
import com.example.user.impl.UserManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module()
class UserModule {

    @Provides
    @Singleton
    fun provideUserManager(): IUserManager {
        return UserManager()
    }
}