package com.franctan.kotlindagger.main_activity.home_fragment

import com.franctan.kotlindagger.injection.fragment.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = arrayOf(HomeFragmentDependenciesModule::class))
    abstract fun contibutesHomeFragment(): HomeFragment
}