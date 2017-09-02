package com.franctan.kotlindagger.main_activity.injection

import com.franctan.kotlindagger.main_activity.MainActivity
import com.franctan.kotlindagger.main_activity.dashboard_fragment.DashboardFragment
import com.franctan.kotlindagger.main_activity.home_fragment.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module(includes = arrayOf(TestMainActivityDependenciesModule::class))
abstract class TestMainActivityModule {
    @ContributesAndroidInjector
    abstract fun contibutesMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contibutesDashboardFragment(): DashboardFragment

    @ContributesAndroidInjector
    abstract fun contibutesHomeFragment(): HomeFragment
}