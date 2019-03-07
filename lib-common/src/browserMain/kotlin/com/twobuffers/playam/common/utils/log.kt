package com.twobuffers.playam.common.utils

internal actual fun writeLogMessage(msg: String, logLevel: LogLevel, tag: String) {
    when (logLevel) {
        LogLevel.DEBUG -> console.log(msg)
        LogLevel.INFO -> console.info(msg)
        LogLevel.WARN -> console.warn(msg)
        LogLevel.ERROR -> console.error(msg)
    }
}
