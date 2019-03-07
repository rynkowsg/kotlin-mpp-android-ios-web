package com.twobuffers.common.utils

enum class LogLevel {
    DEBUG, INFO, WARN, ERROR
}

internal expect fun writeLogMessage(message: String, logLevel: LogLevel, tag: String)

fun logDebug(msg: String, tag: String = "") = writeLogMessage(msg, LogLevel.DEBUG, tag)
fun logInfo(msg: String, tag: String = "") = writeLogMessage(msg, LogLevel.INFO, tag)
fun logWarn(msg: String, tag: String = "") = writeLogMessage(msg, LogLevel.WARN, tag)
fun logError(msg: String, tag: String = "") = writeLogMessage(msg, LogLevel.ERROR, tag)
