package com.franctan.kotlindagger.main_activity.dashboard_fragment

import com.franctan.kotlindagger.injection.fragment.FragmentScope
import com.franctan.kotlindagger.main_activity.CommonClass
import com.franctan.kotlindagger.networking.MyNetworkingService
import dagger.Module
import dagger.Provides


@Module
class DashboardFragmentDependenciesModule {
    @Provides
    @FragmentScope
    fun provideDashboardFragmentDependency(myNetworkingService: MyNetworkingService, commonClass: CommonClass): DashboardFragmentDependency {
        return DashboardFragmentDependency(myNetworkingService, commonClass)
    }
}