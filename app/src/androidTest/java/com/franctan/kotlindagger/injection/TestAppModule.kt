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
//
//    @Provides
//    @Singleton
//    fun provideNetworkingService(): NetworkingService {
//        return Mockito.mock(NetworkingService::class.java)
//    }
//
//
//    @Provides
//    @Singleton
//    fun providePreferences(): MyPreferences {
//        return Mockito.mock(MyPreferences::class.java)
//    }
}