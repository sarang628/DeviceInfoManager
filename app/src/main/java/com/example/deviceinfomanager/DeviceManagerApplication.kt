package com.example.deviceinfomanager

import android.app.Application
import com.example.devicemanager.DeviceManagerModule
import com.example.torang_devicemanager.TorangDeviceManagerModule

class DeviceManagerApplication : Application() {
    val appComponent = DaggerAppComponent.builder()
        .deviceManagerModule(DeviceManagerModule(this))
        .torangDeviceManagerModule(TorangDeviceManagerModule(this))
        .build()
}