package com.franctan.kotlindagger.android

import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.franctan.kotlindagger.MyApp


class MyPreferences {

    private val prefs: SharedPreferences

    constructor(app: MyApp) {
        prefs = PreferenceManager.getDefaultSharedPreferences(app)
    }

    fun setName(input: String) {
        prefs.edit().putString("name", input).apply()
    }

    fun getName(): String {
        return prefs.getString("name", "")
    }

}