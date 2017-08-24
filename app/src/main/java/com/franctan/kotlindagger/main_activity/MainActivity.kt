package com.franctan.kotlindagger.main_activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.franctan.kotlindagger.R
import com.franctan.kotlindagger.navigation.Navigator
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity :
        AppCompatActivity()
        , HasSupportFragmentInjector
        , MainView {

    private val TAG = this.javaClass.simpleName

    @Inject
    lateinit var mainActivityDependency: MainActivityDependency

    @Inject
    lateinit var navigator: Navigator

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                navigator.openHomeFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                navigator.openDashboardFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                navigator.openNotificationsActivity()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return dispatchingAndroidInjector
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        navigator.openHomeFragment()
    }

    override fun onStart() {
        super.onStart()
        main_dependencies.text = mainActivityDependency.getDependencyNames()
        mainActivityDependency.triggerDoSomething()
    }


    override fun doSomething() {
        Log.v(TAG, "Do something")
    }

}
