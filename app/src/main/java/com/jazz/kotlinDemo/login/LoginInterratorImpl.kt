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
class LoginInteratorImpl:LoginInteractor{
    @Suppress("UNREACHABLE_CODE")
    override fun login(user: User, loginListener: LoginInteractor.OnLoginFinishedListener) {
        Handler().postDelayed({
            when {
                user.userName.isNullOrEmpty() -> loginListener.onUserNameError()
                user.password.isNullOrEmpty() -> loginListener.onPasswordError()
                else -> loginListener.onSuccess()
            }
        },2000)
    }

}