package com.jazz.kotlinDemo.login

/**
 * Created by xinggang_yin on 2018/1/23 0023.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/1/23 0023
 * description ${TODO}
 */
interface LoginView  {
    fun showProgress()
    fun hideProgress()
    fun setUserNameError()
    fun setPasswordError()
    fun navigateToMain()
}