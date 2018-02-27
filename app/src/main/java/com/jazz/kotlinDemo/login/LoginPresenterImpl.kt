package com.jazz.kotlinDemo.login

import com.jazz.kotlinDemo.bean.User

/**
 * Created by xinggang_yin on 2018/1/23 0023.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/1/23 0023
 * description ${TODO}
 */
class LoginPresenterImpl(private var loginView: LoginView) : LoginPresenter,LoginInteractor.OnLoginFinishedListener{
    override fun onUserNameError() {
        loginView.hideProgress()
        loginView.setUserNameError()
    }

    override fun onPasswordError() {
        loginView.hideProgress()
        loginView.setPasswordError()
    }

    override fun onSuccess() {
        loginView.hideProgress()
        loginView.navigateToMain()
    }

    private val loginInteratorImpl = LoginInteratorImpl()

    override fun login(user: User) {
        loginView.showProgress()
        loginInteratorImpl.login(user,this)
    }

    override fun destroy() {

    }



}