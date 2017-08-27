package com.franctan.kotlindagger.networking

import com.franctan.kotlindagger.MyApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class NetworkingModule {
    @Provides
    @Singleton
    fun provideNetworkingService(myApp: MyApp): MyNetworkingService {
        return MyNetworkingServiceImpl(myApp)
    }
}