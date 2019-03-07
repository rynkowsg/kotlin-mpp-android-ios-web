package com.twobuffers.common.presentation

interface MainPresenter {
    fun attach(view: MainView)
    fun detach()

    fun onFabClick()
    fun onHelloBtnClick()
    fun onInfoBtnClick()
}
