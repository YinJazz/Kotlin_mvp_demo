package com.jazz.kotlinDemo.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.app.FragmentActivity
import android.view.View
import com.jazz.kotlinDemo.R
import com.jazz.kotlinDemo.bean.User
import com.jazz.kotlinDemo.main.MainActivity
import com.jazz.kotlinDemo.utils.SPUtils
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),LoginView {

    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        if (!SPUtils.getString("userName","").isNullOrEmpty()){
            MainActivity.jumpToMain(this)
            finish()
            return
        }

        btn_login.apply {
            setOnClickListener {
                user = User(edt_user_name.text.toString(),edt_password.text.toString())
                LoginPresenterImpl(this@LoginActivity).login(user)
            }
        }

    }

    override fun showProgress() {
        progress.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progress.visibility = View.GONE
    }

    override fun setUserNameError() {
        edt_user_name.error = "用户名不能为空"
        edt_user_name.requestFocus()
    }

    override fun setPasswordError() {
        edt_password.error = "密码不能为空"
        edt_password.requestFocus()
    }

    override fun navigateToMain() {
        SPUtils.putString("userName", user.userName)
        MainActivity.jumpToMain(this)
        finish()
    }



    companion object {
        private const val REMEMBER_NAME = "remember_name"


        fun jumpToLogin(activity:FragmentActivity,is_remember_name:Boolean = false){
            activity.startActivity(Intent(activity,LoginActivity::class.java)
                    .apply { putExtra(REMEMBER_NAME,is_remember_name) })
            ActivityOptionsCompat.makeSceneTransitionAnimation(activity).toBundle()
        }

    }

}
