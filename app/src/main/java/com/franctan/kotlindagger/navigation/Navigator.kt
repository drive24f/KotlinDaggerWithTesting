package com.franctan.kotlindagger.navigation

import android.support.v4.app.Fragment
import com.franctan.kotlindagger.OpenClassOnDebug
import com.franctan.kotlindagger.R
import com.franctan.kotlindagger.main_activity.MainActivity
import com.franctan.kotlindagger.main_activity.dashboard_fragment.DashboardFragment
import com.franctan.kotlindagger.main_activity.home_fragment.HomeFragment
import com.franctan.kotlindagger.notifications.NotificationsActivity

@OpenClassOnDebug
class Navigator(private val mainActivity: MainActivity) {

    fun openHomeFragment() {
        val homeFragment = HomeFragment.newInstance()
        replaceFragment(homeFragment)
    }

    fun openDashboardFragment() {
        val dashboardFragment = DashboardFragment.newInstance()
        replaceFragment(dashboardFragment)
    }

    fun openNotificationsActivity(){
        val intent = NotificationsActivity.getCallingIntent(mainActivity)
        mainActivity.startActivity(intent)
    }

    private fun replaceFragment(fragment: Fragment) {
        mainActivity
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameContainer, fragment, fragment.javaClass.simpleName)
                .commit()
    }
}