package com.franctan.kotlindagger.test_support

import android.support.annotation.IdRes
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText

class EspressoTestHelper {

    companion object {
        fun viewContainsText(@IdRes viewId: Int, text: String) {
            getView(viewId).check(matches(withText(text)))
        }

        fun clickBtn(@IdRes viewId: Int) {
            getView(viewId).perform(click())
        }

        fun clearAndTypeString(@IdRes viewId: Int, text: String) {
            getView(viewId).perform(clearText())
            getView(viewId).perform(typeText(text))
        }

        fun getView(@IdRes viewId: Int): ViewInteraction {
            return onView(withId(viewId))
        }

    }

}


