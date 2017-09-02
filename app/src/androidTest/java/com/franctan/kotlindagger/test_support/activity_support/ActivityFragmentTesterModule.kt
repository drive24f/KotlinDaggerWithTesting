package com.franctan.kotlindagger.test_support.activity_support

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityFragmentTesterModule {
    @ContributesAndroidInjector
    abstract fun contributeActivitySupport(): ActivityFragmentTester
}