package com.franctan.kotlindagger.notifications

import com.franctan.kotlindagger.android.MyPreferences
import com.franctan.kotlindagger.common.pretty
import com.franctan.kotlindagger.main_activity.SharedClass
import com.franctan.kotlindagger.networking.NetworkingService


class NotificationActivityDependency constructor(
        private val networkingService: NetworkingService
        , private val myPreferences: MyPreferences
        , private val sharedClass: SharedClass) {


    fun getDependencyName(): String {
        return "${this.pretty()} " +
                "- ${sharedClass.pretty()} " +
                "- ${myPreferences.pretty()} " +
                "- ${networkingService.pretty()}"
    }
}