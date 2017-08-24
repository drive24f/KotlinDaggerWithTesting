package com.franctan.kotlindagger.main_activity.home_fragment

import com.franctan.kotlindagger.injection.fragment.FragmentScope
import com.franctan.kotlindagger.main_activity.SharedClass
import com.franctan.kotlindagger.networking.NetworkingService
import dagger.Module
import dagger.Provides


@Module
class HomeFragmentDependenciesModule {
    @Provides
    @FragmentScope
    fun provideHomeFragmentDependency(homeView: HomeView, networkingService: NetworkingService, sharedClass: SharedClass): HomeFragmentDependency {
        return HomeFragmentDependency(homeView, networkingService, sharedClass)
    }

    @Provides
    @FragmentScope
    fun provideHomeView(homeFragment: HomeFragment): HomeView {
        return homeFragment
    }
}