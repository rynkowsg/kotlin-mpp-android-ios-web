package com.twobuffers.playam.ui

import android.app.Application
import android.util.Log

class PlayamApp : Application() {
    companion object {
        const val TAG = "PlayamApp"
    }

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "onCreate")
    }

    override fun onTerminate() {
        Log.i(TAG, "onTerminate")
        super.onTerminate()
    }

    override fun onLowMemory() {
        Log.i(TAG, "onLowMemory")
        super.onLowMemory()
    }
}
