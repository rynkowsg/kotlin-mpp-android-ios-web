package com.twobuffers.playamwebapp

import com.twobuffers.playam.common.presentation.MainPresenterImpl
import com.twobuffers.playam.common.presentation.MainView
import com.twobuffers.playam.common.utils.logDebug
import org.w3c.dom.events.Event
import kotlin.browser.document
import kotlin.browser.window

private val presenter = MainPresenterImpl()

fun main(args: Array<String>) {
    logDebug("> main()")
    document.addEventListener("DOMContentLoaded", {
        logDebug("DOMContentLoaded")
        presenter.attach(object : MainView {
            override fun renderText(text: String) {
                document.getElementById("text-block")?.innerHTML = text
            }
            override fun showPopup(text: String) = window.alert(text)
        })
        document.getElementById("helloButton")?.addEventListener("click", { presenter.onHelloBtnClick() })
        document.getElementById("infoButton")?.addEventListener("click", { presenter.onInfoBtnClick() })
    })
}

@Suppress("UNUSED_PARAMETER")
fun start(e: Event) {
    logDebug("> start()")
}
