package com.jazz.kotlinDemo.main

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.jazz.kotlinDemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MainView {
    var adapter:MainAdapter? = null
    var lists: MutableList<String> = arrayListOf()

    private var index = 0
    private val presenter: MainPresenterImpl = MainPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.getMainData(index)

        empty.setOnClickListener{
            index++
            presenter.getMainData(index)
        }

        srl.setOnRefreshListener {
            index++
            presenter.getMainData(index)
        }

    }


    override fun showProgress() {
        progress.visibility = VISIBLE
    }

    override fun hideProgress() {
        progress.visibility = GONE
    }

    override fun showResult(list: List<String>) {
        lists.clear()
        lists.addAll(list)
        adapter = MainAdapter(lists,this)
        lv.adapter = adapter
        lv.visibility = VISIBLE
        empty.visibility = GONE
        srl.isRefreshing = false
    }

    override fun showError() {
        adapter = MainAdapter(null,this)
        lv.adapter = adapter
        lv.visibility = GONE
        empty.visibility = VISIBLE
        srl.isRefreshing = false
    }

    companion object {
        fun jumpToMain(activity: AppCompatActivity){
            activity.startActivity(Intent(activity,MainActivity::class.java))
            ActivityOptionsCompat.makeSceneTransitionAnimation(activity).toBundle()
        }
    }

}



