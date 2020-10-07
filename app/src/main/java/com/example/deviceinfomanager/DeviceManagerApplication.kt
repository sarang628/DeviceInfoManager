package com.example.deviceinfomanager

import android.app.Application

class DeviceManagerApplication : Application() {
    val appComponent = DaggerAppComponent.builder().build()
}