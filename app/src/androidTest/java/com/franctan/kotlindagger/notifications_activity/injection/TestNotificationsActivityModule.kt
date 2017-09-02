package com.franctan.kotlindagger.notifications_activity.injection

import com.franctan.kotlindagger.notifications.NotificationsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module(includes = arrayOf(TestNotificationsActivityDependenciesModule::class))
abstract class TestNotificationsActivityModule {
    @ContributesAndroidInjector
    abstract fun contibutesNotificationsActivity(): NotificationsActivity
}