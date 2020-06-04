package com.example.pay.module

import dagger.Module

@Module(
    includes = [
        PayActivityModule::class
    ]
)
class PayModule {
}