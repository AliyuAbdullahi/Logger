package com.heetch.testlogger

object LogFile {
    fun Log(message: String) {
        android.util.Log.d("LOGGING", message)
    }
}