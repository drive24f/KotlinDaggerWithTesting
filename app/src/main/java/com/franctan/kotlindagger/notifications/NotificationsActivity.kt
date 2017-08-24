package com.franctan.kotlindagger.notifications

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.franctan.kotlindagger.R
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class NotificationsActivity :
        AppCompatActivity() {

    companion object {
        fun getCallingIntent(context: Context): Intent {
            val intent = Intent(context, NotificationsActivity::class.java)
            return intent
        }
    }

    @Inject
    lateinit var notificationsActivityDependency: NotificationActivityDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
    }

    override fun onStart() {
        super.onStart()
        main_dependencies.text = notificationsActivityDependency.getDependencyName()
    }

}