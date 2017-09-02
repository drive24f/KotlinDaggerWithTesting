package com.franctan.kotlindagger.notifications_activity.injection

import com.franctan.kotlindagger.notifications.NotificationActivityDependency
import dagger.Module
import dagger.Provides
import org.mockito.Mockito.mock
import javax.inject.Singleton


@Module
class TestNotificationsActivityDependenciesModule {
    @Singleton
    @Provides
    fun provideNotificationsActivityDependency(): NotificationActivityDependency {
        return mock(NotificationActivityDependency::class.java)
    }
}