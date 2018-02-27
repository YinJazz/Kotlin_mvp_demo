package com.jazz.kotlinDemo.main

/**
 * Created by xinggang_yin on 2018/2/26 0026.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/2/26 0026
 * description ${TODO}
 */
interface MainInterater {

    interface OnMainResultListener{
        fun onSuccess(response: List<String>)
        fun onFail(error: String? = null)
    }
     fun getMainData(index: Int,listener: OnMainResultListener)

}