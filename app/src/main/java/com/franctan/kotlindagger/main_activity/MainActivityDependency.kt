package com.franctan.kotlindagger.main_activity

import com.franctan.kotlindagger.OpenClassOnDebug
import com.franctan.kotlindagger.android.MyPreferences
import com.franctan.kotlindagger.common.pretty
import com.franctan.kotlindagger.networking.MyNetworkingService


@OpenClassOnDebug
class MainActivityDependency(
        private val mainView: MainView
        , private val myPreferences: MyPreferences
        , private val commonClass: CommonClass
        , private val myNetworkingService: MyNetworkingService
) {
    fun getDependencyNames(): String {
        return "${mainView.pretty()} - ${myPreferences.pretty()} - ${this.pretty()} - ${commonClass.pretty()} - ${myNetworkingService.pretty()} "
    }

    fun triggerDoSomething() {
        mainView.doSomething()
    }

}