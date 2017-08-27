package com.franctan.kotlindagger.main_activity.injection

import com.franctan.kotlindagger.injection.activity.ActivityScope
import com.franctan.kotlindagger.main_activity.MainActivity
import com.franctan.kotlindagger.main_activity.MainView
import com.franctan.kotlindagger.main_activity.dashboard_fragment.DashboardFragmentModule
import com.franctan.kotlindagger.main_activity.home_fragment.HomeFragmentModule
import dagger.Binds
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

    @ActivityScope
    @Binds
    abstract fun bindsMainActivityToMainView(mainActivity: MainActivity): MainView
}