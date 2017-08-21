package com.franctan.kotlindagger.main_activity.dashboard_fragment

import com.franctan.kotlindagger.injection.fragment.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class DashboardFragmentModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = arrayOf(DashboardFragmentDependenciesModule::class))
    abstract fun contibutesDashboardFragment(): DashboardFragment
}