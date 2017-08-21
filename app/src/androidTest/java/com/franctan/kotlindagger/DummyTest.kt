package com.franctan.kotlindagger

import android.support.test.runner.AndroidJUnit4
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito


@RunWith(AndroidJUnit4::class)
class DummyTest {

    @Test
    fun test1() {
//        val mock = Mockito.mock(Dummy::class.java)
//        Mockito.`when`(mock.test()).thenReturn(false)
        Assert.assertFalse(false)
    }

}