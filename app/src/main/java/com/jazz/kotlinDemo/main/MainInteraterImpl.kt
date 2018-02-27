package com.jazz.kotlinDemo.main

import android.os.Handler

/**
 * Created by xinggang_yin on 2018/2/26 0026.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/2/26 0026
 * description ${TODO}
 */
class MainInteraterImpl:MainInterater{
    override fun getMainData(index: Int, listener: MainInterater.OnMainResultListener) {
        Handler().postDelayed({
                when{
                    index%2 == 1 -> {
                        val lists: List<String> = listOf("鸟1","鸟2","鸟3","鸟4","鸟5","鸟6","鸟7","鸟8")
                        listener.onSuccess(lists)
                    }
                    else -> listener.onFail()
                }},1000
        )

    }
}