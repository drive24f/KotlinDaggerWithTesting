package com.franctan.kotlindagger.main_activity.dashboard_fragment

import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.franctan.kotlindagger.R
import com.franctan.kotlindagger.TestApp
import com.franctan.kotlindagger.main_activity.home_fragment.HomeFragment
import com.franctan.kotlindagger.test_support.EspressoTestHelper
import com.franctan.kotlindagger.test_support.activity_support.ActivityFragmentTester
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import javax.inject.Inject

@RunWith(AndroidJUnit4::class)
class DashboardFragmentTest {

    @Rule
    @JvmField
    val activityRule: ActivityTestRule<ActivityFragmentTester> = ActivityTestRule(
            ActivityFragmentTester::class.java, true, false)

    @Inject lateinit var dashboardFragmentDependency: DashboardFragmentDependency

    lateinit var dashboardFragment: DashboardFragment

    @Before
    fun before() {
        val testApp = InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as TestApp
        testApp.daggerComponent.inject(this)
        dashboardFragment = DashboardFragment.newInstance()
    }

    @Test
    fun getDependency_checkStringIsDisplayed() {
        val mockString = "Dashboard fragment test string"
        Mockito.`when`(dashboardFragmentDependency.getDependencyName()).thenReturn(mockString)
        activityRule.launchActivity(null)
        activityRule.activity.replaceFragment(dashboardFragment)
        EspressoTestHelper.viewContainsText(R.id.dashboard_fragment_dependencies, mockString)
    }

}