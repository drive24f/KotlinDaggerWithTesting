package com.franctan.kotlindagger.main_activity.home_fragment

import com.franctan.kotlindagger.injection.fragment.FragmentScope
import com.franctan.kotlindagger.main_activity.CommonClass
import com.franctan.kotlindagger.networking.MyNetworkingService
import dagger.Module
import dagger.Provides


@Module
class HomeFragmentDependenciesModule {
    @Provides
    @FragmentScope
    fun provideHomeFragmentDependency(homeView: HomeView, myNetworkingService: MyNetworkingService, commonClass: CommonClass): HomeFragmentDependency {
        return HomeFragmentDependency(homeView, myNetworkingService, commonClass)
    }
}