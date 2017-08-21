package com.franctan.kotlindagger.main_activity.injection

import com.franctan.kotlindagger.injection.activity.ActivityScope
import com.franctan.kotlindagger.main_activity.MainActivity
import com.franctan.kotlindagger.main_activity.home_fragment.TestHomeFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class TestMainActivityModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contibutesMainActivity(): MainActivity

}