package com.franctan.kotlindagger.notifications

import com.franctan.kotlindagger.OpenClassOnDebug
import com.franctan.kotlindagger.android.MyPreferences
import com.franctan.kotlindagger.common.pretty
import com.franctan.kotlindagger.main_activity.CommonClass
import com.franctan.kotlindagger.networking.MyNetworkingService


@OpenClassOnDebug
class NotificationActivityDependency constructor(
        private val myNetworkingService: MyNetworkingService
        , private val myPreferences: MyPreferences
        , private val commonClass: CommonClass) {


    fun getDependencyNames(): String {
        return "${this.pretty()} " +
                "- ${commonClass.pretty()} " +
                "- ${myPreferences.pretty()} " +
                "- ${myNetworkingService.pretty()}"
    }
}