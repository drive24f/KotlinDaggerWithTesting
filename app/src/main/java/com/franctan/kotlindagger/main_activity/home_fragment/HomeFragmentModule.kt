package com.franctan.kotlindagger.main_activity.home_fragment

import com.franctan.kotlindagger.injection.fragment.FragmentScope
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = arrayOf(HomeFragmentDependenciesModule::class))
    abstract fun contibutesHomeFragment(): HomeFragment

    @FragmentScope
    @Binds
    abstract fun bindHomeFragmentToHomeView(homeFragment: HomeFragment): HomeView
}