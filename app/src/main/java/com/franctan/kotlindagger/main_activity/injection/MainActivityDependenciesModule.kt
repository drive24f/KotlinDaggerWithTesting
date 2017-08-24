package com.franctan.kotlindagger.main_activity.injection

import com.franctan.kotlindagger.android.MyPreferences
import com.franctan.kotlindagger.injection.activity.ActivityScope
import com.franctan.kotlindagger.main_activity.MainActivity
import com.franctan.kotlindagger.main_activity.MainActivityDependency
import com.franctan.kotlindagger.main_activity.MainView
import com.franctan.kotlindagger.main_activity.SharedClass
import com.franctan.kotlindagger.navigation.Navigator
import com.franctan.kotlindagger.networking.NetworkingService
import dagger.Module
import dagger.Provides


@Module
class MainActivityDependenciesModule {

    @Provides
    @ActivityScope
    fun provideMainActivityDependency(mainView: MainView
                                      , myPreferences: MyPreferences
                                      , sharedClass: SharedClass
                                      , networkingService: NetworkingService): MainActivityDependency {
        return MainActivityDependency(mainView, myPreferences, sharedClass, networkingService)
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

    @Provides
    @ActivityScope
    fun provideMainView(activity: MainActivity): MainView {
        return activity
    }


}