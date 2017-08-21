package com.franctan.kotlindagger.notifications.injection

import com.franctan.kotlindagger.android.MyPreferences
import com.franctan.kotlindagger.injection.activity.ActivityScope
import com.franctan.kotlindagger.main_activity.SharedClass
import com.franctan.kotlindagger.networking.NetworkingService
import com.franctan.kotlindagger.notifications.NotificationActivityDependency
import dagger.Module
import dagger.Provides

@Module
class NotificationActivityDependenciesModule {

    @ActivityScope
    @Provides
    fun provideNotificationsActivityDependency(networkingService: NetworkingService
                                               , myPreferences: MyPreferences
                                               , sharedClass: SharedClass): NotificationActivityDependency {
        return NotificationActivityDependency(networkingService, myPreferences, sharedClass)
    }

    @Provides
    @ActivityScope
    fun provideSharedClass(): SharedClass {
        return SharedClass()
    }

}