package com.franctan.kotlindagger.injection

import com.franctan.kotlindagger.MyApp
import com.franctan.kotlindagger.TestApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class TestAppModule {
    @Provides
    @Singleton
    fun provideMyApp(testApp: TestApp): MyApp {
        return testApp
    }
}