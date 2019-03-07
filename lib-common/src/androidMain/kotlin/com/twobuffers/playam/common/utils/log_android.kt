package com.twobuffers.playam.common.utils

import android.util.Log

internal actual fun writeLogMessage(msg: String, logLevel: LogLevel, tag: String) {
    when (logLevel) {
        LogLevel.DEBUG -> Log.d(tag, msg)
        LogLevel.INFO -> Log.i(tag, msg)
        LogLevel.WARN -> Log.w(tag, msg)
        LogLevel.ERROR -> Log.e(tag, msg)
    }
}
