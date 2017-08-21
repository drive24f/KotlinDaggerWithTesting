package com.franctan.kotlindagger.main_activity.injection

import com.franctan.kotlindagger.android.MyPreferences
import com.franctan.kotlindagger.injection.activity.ActivityScope
import com.franctan.kotlindagger.main_activity.MainActivity
import com.franctan.kotlindagger.main_activity.MainActivityDependency
import com.franctan.kotlindagger.main_activity.SharedClass
import com.franctan.kotlindagger.navigation.Navigator
import com.franctan.kotlindagger.networking.NetworkingService
import dagger.Module
import dagger.Provides


@Module
class MainActivityDependenciesModule {

    @Provides
    @ActivityScope
    fun provideMainActivityDependency(myPreferences: MyPreferences
                         , sharedClass: SharedClass
                         , networkingService: NetworkingService): MainActivityDependency {
        return MainActivityDependency(myPreferences, sharedClass, networkingService)
    }

    @Provides
    @ActivityScope
    fun provideNavigator(activity: MainActivity): Navigator {
        return Navigator(activity)
    }

    @Provides
    @ActivityScope
    fun provideSharedClass(): SharedClass {
        return SharedClass()
    }

}