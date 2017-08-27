package com.franctan.kotlindagger.main_activity.home_fragment

import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.franctan.kotlindagger.R
import com.franctan.kotlindagger.TestApp
import com.franctan.kotlindagger.test_support.EspressoTestHelper
import com.franctan.kotlindagger.test_support.activity_support.ActivityFragmentTester
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import javax.inject.Inject


@RunWith(AndroidJUnit4::class)
class HomeFragmentTest {

    @Rule
    @JvmField
    val activityRule: ActivityTestRule<ActivityFragmentTester> = ActivityTestRule(
            ActivityFragmentTester::class.java, true, false)


    @Inject lateinit var homeFragmentDependency: HomeFragmentDependency

    lateinit var homeFragment: HomeFragment


    @Before
    fun before() {
        val testApp = InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as TestApp
        testApp.daggerComponent.inject(this)
        homeFragment = HomeFragment.newInstance()
    }

    @Test
    fun getDependency_checkStringIsDisplayed() {
        val mockString = "Hello World Home Fragment Test"
        Mockito.`when`(homeFragmentDependency.getDependencyName()).thenReturn(mockString)
        activityRule.launchActivity(null)

        activityRule.activity.replaceFragment(homeFragment)

        EspressoTestHelper.viewContainsText(R.id.home_fragment_dependencies, mockString)
    }

}

