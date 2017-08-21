package com.franctan.kotlindagger.injection

import com.franctan.kotlindagger.TestApp
import com.franctan.kotlindagger.main_activity.MainActivityTest
import com.franctan.kotlindagger.main_activity.dashboard_fragment.TestDashboardFragmentModule
import com.franctan.kotlindagger.main_activity.home_fragment.HomeFragmentTest
import com.franctan.kotlindagger.main_activity.home_fragment.TestHomeFragmentModule
import com.franctan.kotlindagger.main_activity.injection.TestMainActivityDependenciesModule
import com.franctan.kotlindagger.main_activity.injection.TestMainActivityModule
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
//                , TestAppModule::class
                , ActivityFragmentTesterModule::class
                , TestMainActivityModule::class
                , TestMainActivityDependenciesModule::class
                , TestDashboardFragmentModule::class
                , TestHomeFragmentModule::class

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
    fun inject(test: HomeFragmentTest)
}