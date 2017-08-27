package com.franctan.kotlindagger.injection.app

import com.franctan.kotlindagger.MyApp
import com.franctan.kotlindagger.android.AndroidModule
import com.franctan.kotlindagger.main_activity.injection.MainActivityModule
import com.franctan.kotlindagger.networking.NetworkingModule
import com.franctan.kotlindagger.notifications.injection.NotificationsActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class
        , NetworkingModule::class
        , AndroidModule::class
        , MainActivityModule::class
        , NotificationsActivityModule::class
))
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(myApp: MyApp): Builder
        fun build(): AppComponent
    }
    fun inject(myApp: MyApp)
}