package com.jazz.kotlinDemo.login

import com.jazz.kotlinDemo.base.BasePresenter
import com.jazz.kotlinDemo.bean.User

/**
 * Created by xinggang_yin on 2018/1/23 0023.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/1/23 0023
 * description ${TODO}
 */
interface LoginPresenter: BasePresenter{
    fun login(user: User)
}

