package com.franctan.kotlindagger

import com.franctan.kotlindagger.injection.app.DaggerTestAppComponent
import com.franctan.kotlindagger.injection.app.TestAppComponent


class TestApp : MyApp() {

    lateinit var daggerComponent: TestAppComponent

    override fun injectDagger() {
        daggerComponent = DaggerTestAppComponent
                .builder()
                .application(this)
                .build()

        daggerComponent.inject(this)
    }

}