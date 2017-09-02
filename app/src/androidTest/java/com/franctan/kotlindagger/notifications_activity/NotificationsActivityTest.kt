package com.franctan.kotlindagger.notifications_activity

import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.franctan.kotlindagger.R
import com.franctan.kotlindagger.TestApp
import com.franctan.kotlindagger.notifications.NotificationActivityDependency
import com.franctan.kotlindagger.notifications.NotificationsActivity
import com.franctan.kotlindagger.test_support.EspressoTestHelper
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import javax.inject.Inject


@RunWith(AndroidJUnit4::class)
class NotificationsActivityTest {

    @Rule
    @JvmField
    val activityRule: ActivityTestRule<NotificationsActivity> = ActivityTestRule(
            NotificationsActivity::class.java, true, false)

    @Inject lateinit var notificationsActivityDependency: NotificationActivityDependency

    @Before
    fun before() {
        val testApp = InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as TestApp
        testApp.daggerComponent.inject(this)
        Mockito.reset(notificationsActivityDependency)
    }

    @Test
    fun check_notificationsActivityDependency() {
        val mockString = "lots of notifications"
        Mockito.`when`(notificationsActivityDependency.getDependencyNames()).thenReturn(mockString)
        activityRule.launchActivity(null)

        EspressoTestHelper.viewContainsText(R.id.main_dependencies, mockString)
    }



}
