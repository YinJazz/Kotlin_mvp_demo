package com.jazz.kotlinDemo.utils

import android.content.Context
import android.content.SharedPreferences
import com.jazz.kotlinDemo.base.MyApplication

/**
 * Created by xinggang_yin on 2018/1/24 0024.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/1/24 0024
 * description ${TODO}
 */
object SPUtils{
    private val sp: SharedPreferences
    private val context:MyApplication = MyApplication.app;
    init {
        sp  = context.getSharedPreferences("login_info", Context.MODE_PRIVATE)
    }

    fun putString(key:String,value:String?){
        val editor = sp.edit()
        editor?.putString(key,value)
        editor?.apply()
    }

    fun getString(key:String,defValue:String):String?{
        return sp.getString(key,defValue)
    }

    fun detele(key:String){
        detele(key)
    }


}