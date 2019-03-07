package com.twobuffers.playam.common.presentation

interface MainPresenter {
    fun attach(view: MainView)
    fun detach()

    fun onFabClick()
    fun onHelloBtnClick()
    fun onInfoBtnClick()
}
