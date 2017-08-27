package com.franctan.kotlindagger.main_activity.injection

import com.franctan.kotlindagger.android.MyPreferences
import com.franctan.kotlindagger.injection.activity.ActivityScope
import com.franctan.kotlindagger.main_activity.CommonClass
import com.franctan.kotlindagger.main_activity.MainActivity
import com.franctan.kotlindagger.main_activity.MainActivityDependency
import com.franctan.kotlindagger.main_activity.MainView
import com.franctan.kotlindagger.navigation.Navigator
import com.franctan.kotlindagger.networking.MyNetworkingService
import dagger.Module
import dagger.Provides

@Module
class MainActivityDependenciesModule {
    @Provides
    @ActivityScope
    fun provideMainActivityDependency(mainView: MainView
                                      , myPreferences: MyPreferences
                                      , commonClass: CommonClass
                                      , myNetworkingService: MyNetworkingService): MainActivityDependency {
        return MainActivityDependency(mainView, myPreferences, commonClass, myNetworkingService)
    }

    @Provides
    @ActivityScope
    fun provideNavigator(activity: MainActivity): Navigator {
        return Navigator(activity)
    }

    @Provides
    @ActivityScope
    fun provideCommonClass(): CommonClass {
        return CommonClass()
    }
}