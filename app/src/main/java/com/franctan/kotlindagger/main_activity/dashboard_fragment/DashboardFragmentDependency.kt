package com.franctan.kotlindagger.main_activity.dashboard_fragment

import com.franctan.kotlindagger.OpenClassOnDebug
import com.franctan.kotlindagger.common.pretty
import com.franctan.kotlindagger.main_activity.CommonClass
import com.franctan.kotlindagger.networking.MyNetworkingService

@OpenClassOnDebug
class DashboardFragmentDependency(
        private val myNetworkingService: MyNetworkingService
        , private val commonClass: CommonClass
) {
    fun getDependencyName(): String {
        return "${this.pretty()} - ${commonClass.pretty()} - ${myNetworkingService.pretty()}"
    }
}