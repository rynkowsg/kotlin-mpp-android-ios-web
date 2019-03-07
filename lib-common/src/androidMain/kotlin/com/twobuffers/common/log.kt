package com.twobuffers.common

actual fun writeLogMessage(message: String, logLevel: LogLevel) {
    when (logLevel) {
        LogLevel.DEBUG -> System.out.println("[debug] $message")
        LogLevel.INFO -> System.out.println("[info] $message")
        LogLevel.WARN -> System.out.println("[warning] $message")
        LogLevel.ERROR -> System.out.println("[error] $message")
    }
}
