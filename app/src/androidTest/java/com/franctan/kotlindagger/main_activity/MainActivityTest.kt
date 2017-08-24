package com.franctan.kotlindagger.main_activity

import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.franctan.kotlindagger.R
import com.franctan.kotlindagger.TestApp
import com.franctan.kotlindagger.navigation.Navigator
import com.franctan.kotlindagger.test_support.EspressoTestHelper
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.Mockito.*
import javax.inject.Inject

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(
            MainActivity::class.java, true, false)

    @Inject lateinit var navigator: Navigator
    @Inject lateinit var mainActivityDependency: MainActivityDependency

    @Before
    fun before() {
        val testApp = InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as TestApp
        testApp.daggerComponent.inject(this)
        Mockito.reset(navigator)
        Mockito.reset(mainActivityDependency)
    }

    @Test
    fun check_Navigator_OpenHomeFragment() {
        activityRule.launchActivity(null)
        verify(navigator).openHomeFragment()
    }

    @Test
    fun check_mainActivityDependency() {
        val mockString = "hello world"
        `when`(mainActivityDependency.getDependencyNames()).thenReturn(mockString)
        activityRule.launchActivity(null)

        EspressoTestHelper.viewContainsText(R.id.main_dependencies, mockString)
        verify(mainActivityDependency).triggerDoSomething()
    }



}
