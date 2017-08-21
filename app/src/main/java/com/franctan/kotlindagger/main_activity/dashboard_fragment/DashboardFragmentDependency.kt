package com.franctan.kotlindagger.main_activity.dashboard_fragment

import com.franctan.kotlindagger.OpenClassOnDebug
import com.franctan.kotlindagger.common.pretty
import com.franctan.kotlindagger.main_activity.SharedClass
import com.franctan.kotlindagger.networking.NetworkingService

@OpenClassOnDebug
class DashboardFragmentDependency(
        private val networkingService: NetworkingService
        , private val sharedClass: SharedClass
) {
    fun getDependencyName(): String {
        return "${this.pretty()} - ${sharedClass.pretty()} - ${networkingService.pretty()}"
    }
}