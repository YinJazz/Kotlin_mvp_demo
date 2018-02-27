package com.jazz.kotlinDemo.base

import android.app.Application

/**
 * Created by xinggang_yin on 2018/1/24 0024.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/1/24 0024
 * description ${TODO}
 */
class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        app = this
    }

    companion object {
       lateinit var app:MyApplication
    }

}