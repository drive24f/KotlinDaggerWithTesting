package com.franctan.kotlindagger.notifications.injection

import com.franctan.kotlindagger.android.MyPreferences
import com.franctan.kotlindagger.injection.activity.ActivityScope
import com.franctan.kotlindagger.main_activity.CommonClass
import com.franctan.kotlindagger.networking.MyNetworkingService
import com.franctan.kotlindagger.notifications.NotificationActivityDependency
import dagger.Module
import dagger.Provides

@Module
class NotificationActivityDependenciesModule {

    @ActivityScope
    @Provides
    fun provideNotificationsActivityDependency(myNetworkingService: MyNetworkingService
                                               , myPreferences: MyPreferences
                                               , commonClass: CommonClass): NotificationActivityDependency {
        return NotificationActivityDependency(myNetworkingService, myPreferences, commonClass)
    }

    @Provides
    @ActivityScope
    fun provideCommonClass(): CommonClass {
        return CommonClass()
    }

}