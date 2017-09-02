package com.franctan.kotlindagger.injection.app

import com.franctan.kotlindagger.TestApp
import com.franctan.kotlindagger.main_activity.MainActivityTest
import com.franctan.kotlindagger.main_activity.dashboard_fragment.DashboardFragmentTest
import com.franctan.kotlindagger.main_activity.home_fragment.HomeFragmentTest
import com.franctan.kotlindagger.main_activity.injection.TestMainActivityModule
import com.franctan.kotlindagger.notifications_activity.NotificationsActivityTest
import com.franctan.kotlindagger.notifications_activity.injection.TestNotificationsActivityModule
import com.franctan.kotlindagger.test_support.activity_support.ActivityFragmentTesterModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component
(
        modules = arrayOf(
                AndroidInjectionModule::class
                , ActivityFragmentTesterModule::class
                , TestMainActivityModule::class
                , TestNotificationsActivityModule::class

        ))
interface TestAppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: TestApp): Builder
        fun build(): TestAppComponent
    }

    fun inject(app: TestApp)
    fun inject(testActivity: MainActivityTest)
    fun inject(testActivity: NotificationsActivityTest)
    fun inject(test: HomeFragmentTest)
    fun inject(test: DashboardFragmentTest)
}