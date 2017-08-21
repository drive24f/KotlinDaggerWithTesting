package com.franctan.kotlindagger.main_activity.home_fragment

import com.franctan.kotlindagger.OpenClassOnDebug
import com.franctan.kotlindagger.common.pretty
import com.franctan.kotlindagger.main_activity.SharedClass
import com.franctan.kotlindagger.networking.NetworkingService


@OpenClassOnDebug
class HomeFragmentDependency(
        private val networkingService: NetworkingService
        , private val sharedClass: SharedClass
) {
    fun getDependencyName(): String {
        return "${this.pretty()} - ${sharedClass.pretty()} - ${networkingService.pretty()}"
    }
}