package com.franctan.kotlindagger.main_activity.dashboard_fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.franctan.kotlindagger.R
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.dashboard_fragment.*
import javax.inject.Inject

class DashboardFragment : Fragment() {

    @Inject
    lateinit var mDashboardDependency: DashboardFragmentDependency

    companion object {
        fun newInstance(): DashboardFragment {
            return DashboardFragment()
        }
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.dashboard_fragment, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        textView.text = mDashboardDependency.getDependencyName()
    }

}
