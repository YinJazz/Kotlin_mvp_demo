package com.jazz.kotlinDemo.main

/**
 * Created by xinggang_yin on 2018/2/26 0026.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/2/26 0026
 * description ${TODO}
 */
class MainPresenterImpl(val mainView:MainView):MainPresenter,MainInterater.OnMainResultListener {

    val mainInImpl = MainInteraterImpl()

    override fun destroy() {

    }

    override fun onSuccess(response: List<String>) {
        mainView.showResult(response)
        mainView.hideProgress()
    }

    override fun getMainData(index: Int) {
        mainView.showProgress()
        mainInImpl.getMainData(index,this)
    }

    override fun onFail(error: String?) {
        mainView.showError()
        mainView.hideProgress()
    }
}