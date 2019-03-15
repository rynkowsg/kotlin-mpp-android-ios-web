package com.twobuffers.playamwebapp

import org.w3c.dom.events.Event
import kotlin.browser.document

fun main(args: Array<String>) {
    console.log("> main()")
    document.addEventListener("DOMContentLoaded", {
        println("DOMContentLoaded")
        document.getElementById("helloButton")?.addEventListener("click", ::start)
        document.getElementById("infoButton")?.addEventListener("click", ::start)
    })
}

fun start(ev: Event) {
    console.log("> start()")
}
