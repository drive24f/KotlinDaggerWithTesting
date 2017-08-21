package com.franctan.kotlindagger.notifications.injection

import com.franctan.kotlindagger.injection.activity.ActivityScope
import com.franctan.kotlindagger.notifications.NotificationsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class NotificationsActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(NotificationActivityDependenciesModule::class))
    abstract fun contributesNotificationsActivity(): NotificationsActivity

}