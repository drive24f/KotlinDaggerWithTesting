package com.franctan.kotlindagger.main_activity.injection

import com.franctan.kotlindagger.injection.activity.ActivityScope
import com.franctan.kotlindagger.main_activity.MainActivity
import com.franctan.kotlindagger.main_activity.dashboard_fragment.DashboardFragmentModule
import com.franctan.kotlindagger.main_activity.home_fragment.HomeFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class MainActivityModule {

    @ActivityScope
    @ContributesAndroidInjector
    (modules =
    arrayOf(MainActivityDependenciesModule::class
            , HomeFragmentModule::class
            , DashboardFragmentModule::class
    ))
    abstract fun contibutesMainActivity(): MainActivity

}