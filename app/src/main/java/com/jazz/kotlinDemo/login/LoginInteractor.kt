package com.jazz.kotlinDemo.login

import android.os.Handler
import com.jazz.kotlinDemo.bean.User

/**
 * Created by xinggang_yin on 2018/1/23 0023.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/1/23 0023
 * description ${TODO}
 */
interface LoginInteractor{
    interface OnLoginFinishedListener{
        fun onUserNameError()
        fun onPasswordError()
        fun onSuccess()
    }
    fun login(user: User, loginListener:OnLoginFinishedListener)
}

