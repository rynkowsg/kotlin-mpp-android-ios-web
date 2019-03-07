package com.twobuffers.playam.common.utils

import platform.Foundation.NSLog

internal actual fun writeLogMessage(msg: String, logLevel: LogLevel, tag: String) {
    NSLog(msg)
}
