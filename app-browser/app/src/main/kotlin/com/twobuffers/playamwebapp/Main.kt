package com.twobuffers.playamwebapp

import org.w3c.dom.events.Event
import kotlin.browser.document

fun main(args: Array<String>) {
    println("> main()")
    document.addEventListener("DOMContentLoaded", {
        println("DOMContentLoaded")
        document.getElementById("startButton")?.addEventListener("click", ::start)
    })
}

fun start(ev: Event) {
    println("> start()")
}
