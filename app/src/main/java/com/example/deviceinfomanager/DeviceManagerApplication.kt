package com.example.deviceinfomanager

import android.app.Application
import com.example.devicemanager.DeviceManagerModule

class DeviceManagerApplication : Application() {
    val appComponent = DaggerAppComponent.builder()
        .deviceManagerModule(DeviceManagerModule(this))
        .build()
}