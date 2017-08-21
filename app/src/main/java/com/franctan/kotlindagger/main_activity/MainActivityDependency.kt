package com.franctan.kotlindagger.main_activity

import com.franctan.kotlindagger.OpenClassOnDebug
import com.franctan.kotlindagger.android.MyPreferences
import com.franctan.kotlindagger.common.pretty
import com.franctan.kotlindagger.networking.NetworkingService


@OpenClassOnDebug
class MainActivityDependency(
        private val myPreferences: MyPreferences
        , private val sharedClass: SharedClass
        , private val networkingService: NetworkingService
) {
    fun getDependencyName(): String {
        return "${this.pretty()} - ${sharedClass.pretty()} - ${networkingService.pretty()}"
    }

}