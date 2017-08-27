package com.franctan.kotlindagger.main_activity.injection

import com.franctan.kotlindagger.main_activity.MainActivityDependency
import com.franctan.kotlindagger.main_activity.CommonClass
import com.franctan.kotlindagger.main_activity.dashboard_fragment.DashboardFragmentDependency
import com.franctan.kotlindagger.main_activity.home_fragment.HomeFragmentDependency
import com.franctan.kotlindagger.navigation.Navigator
import dagger.Module
import dagger.Provides
import org.mockito.Mockito.mock
import javax.inject.Singleton


@Module
class TestMainActivityDependenciesModule {

    @Singleton
    @Provides
    fun provideMainActivityDependency(): MainActivityDependency {
        return mock(MainActivityDependency::class.java)
    }

    @Singleton
    @Provides
    fun provideNavigator(): Navigator {
        return mock(Navigator::class.java)
    }

    @Singleton
    @Provides
    fun provideSharedClass(): CommonClass {
        return mock(CommonClass::class.java)
    }

    @Singleton
    @Provides
    fun provideHomeFragmentDependency(): HomeFragmentDependency {
        return mock(HomeFragmentDependency::class.java)
    }

    @Singleton
    @Provides
    fun provideDashboardFragmentDependency(): DashboardFragmentDependency {
        return mock(DashboardFragmentDependency::class.java)
    }
}