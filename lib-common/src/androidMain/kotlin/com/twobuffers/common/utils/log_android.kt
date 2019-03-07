package com.twobuffers.common.utils

import android.util.Log

internal actual fun writeLogMessage(message: String, logLevel: LogLevel, tag: String) {
    when (logLevel) {
        LogLevel.DEBUG -> Log.d(tag, message)
        LogLevel.INFO -> Log.i(tag, message)
        LogLevel.WARN -> Log.w(tag, message)
        LogLevel.ERROR -> Log.e(tag, message)
    }
}
