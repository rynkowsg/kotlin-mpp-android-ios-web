package com.twobuffers.common.utils

internal actual fun writeLogMessage(message: String, logLevel: LogLevel, tag: String) {
    when (logLevel) {
        LogLevel.DEBUG -> console.log(message)
        LogLevel.INFO -> console.info(message)
        LogLevel.WARN -> console.warn(message)
        LogLevel.ERROR -> console.error(message)
    }
}
