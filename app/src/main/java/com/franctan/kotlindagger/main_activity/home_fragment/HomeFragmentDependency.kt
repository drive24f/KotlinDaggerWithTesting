package com.franctan.kotlindagger.main_activity.home_fragment

import com.franctan.kotlindagger.OpenClassOnDebug
import com.franctan.kotlindagger.common.pretty
import com.franctan.kotlindagger.main_activity.CommonClass
import com.franctan.kotlindagger.networking.MyNetworkingService


@OpenClassOnDebug
class HomeFragmentDependency(
        private val homeView: HomeView
        , private val myNetworkingService: MyNetworkingService
        , private val commonClass: CommonClass
) {
    fun getDependencyName(): String {
        return "${this.pretty()} - ${commonClass.pretty()} - ${myNetworkingService.pretty()}"
    }
}