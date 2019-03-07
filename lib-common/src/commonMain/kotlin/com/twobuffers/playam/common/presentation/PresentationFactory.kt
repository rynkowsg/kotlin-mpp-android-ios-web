package com.twobuffers.playam.common.presentation

object PresentationFactory {
    private val mainPresenter = MainPresenterImpl()

    fun provideMainPresenter(): MainPresenter = mainPresenter
}
