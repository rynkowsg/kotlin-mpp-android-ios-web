package com.twobuffers.playam.common.presentation

import com.twobuffers.playam.common.utils.logDebug

class MainPresenterImpl : MainPresenter {
    companion object {
        private val TAG = "MainPresenter"
    }
    private var view: MainView? = null

    override fun attach(view: MainView) {
        this.view = view
        logDebug(tag=TAG, msg="Attached to $view")
    }

    override fun detach() {
        logDebug(tag=TAG, msg="Detached from $view")
        view = null
    }

    override fun onFabClick() {
        logDebug(tag=TAG, msg="FAB clicked")
    }

    override fun onHelloBtnClick() {
        logDebug(tag=TAG, msg="Hello button clicked")
        view?.showPopup("hello gRPC not implemented")
    }

    override fun onInfoBtnClick() {
        logDebug(tag=TAG, msg="Info button clicked")
//        val feature = getServiceInfo.execute()
//        val text = "name: ${feature.name}, version: ${feature.version}"
        view?.showPopup("info gRPC not implemented")
    }
}
