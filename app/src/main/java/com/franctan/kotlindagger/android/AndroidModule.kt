package com.franctan.kotlindagger.android

import com.franctan.kotlindagger.MyApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AndroidModule {
    @Provides
    @Singleton
    fun providePreferences(myApp: MyApp): MyPreferences {
        return MyPreferences(myApp)
    }
}