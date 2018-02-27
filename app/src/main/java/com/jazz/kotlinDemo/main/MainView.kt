package com.jazz.kotlinDemo.main

/**
 * Created by xinggang_yin on 2018/2/26 0026.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/2/26 0026
 * description ${TODO}
 */
interface MainView {
    fun showProgress()
    fun hideProgress()
    fun showResult(list: List<String>)
    fun showError()
}