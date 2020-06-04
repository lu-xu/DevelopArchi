package com.example.myarchi.module

import androidx.lifecycle.ViewModel
import com.example.base.di.scope.ActivityScope
import com.example.base.di.ActivitySubComponentModule
import com.example.base.di.vm.ViewModelKey
import com.example.myarchi.ui.MainActivity
import com.example.myarchi.ui.MainActivityViewModel
import com.example.myarchi.ui.MainFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class MainActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            MainActivitySubComponentModule::class,
            FragmentBuilderModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity

    @Module
    abstract class MainActivitySubComponentModule : ActivitySubComponentModule<MainActivity>()

    @Module
    abstract class FragmentBuilderModule {

        @ContributesAndroidInjector
        abstract fun contributeMainFragment(): MainFragment
    }

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainViewModel(mainActivityViewModel: MainActivityViewModel): ViewModel
}