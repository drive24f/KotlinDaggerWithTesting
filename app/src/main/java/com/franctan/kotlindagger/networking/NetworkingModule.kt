package com.franctan.kotlindagger.networking

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class NetworkingModule {
    @Provides
    @Singleton
    fun provideNetworkingService(): NetworkingService {
        return NetworkingServiceImpl()
    }
}