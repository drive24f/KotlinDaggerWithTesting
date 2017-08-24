//package com.franctan.kotlindagger.main_activity.dashboard_fragment
//
//import com.franctan.kotlindagger.injection.fragment.FragmentScope
//import com.franctan.kotlindagger.main_activity.SharedClass
//import com.franctan.kotlindagger.networking.NetworkingService
//import dagger.Module
//import dagger.Provides
//
//
//@Module
//class DashboardFragmentDependenciesModule {
//    @Provides
//    @FragmentScope
//    fun provideDashboardFragmentDependency(networkingService: NetworkingService, sharedClass: SharedClass): DashboardFragmentDependency {
//        return DashboardFragmentDependency(networkingService, sharedClass)
//    }
//}