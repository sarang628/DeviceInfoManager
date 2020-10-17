package com.example.deviceinfomanager

import com.example.devicemanager.DeviceManagerModule
import com.example.torang_devicemanager.TorangDeviceManagerModule
import dagger.Component
import dagger.Module

@Component(modules = [DeviceManagerModule::class, TorangDeviceManagerModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(screenInfoFragment: ScreenInfoFragment)
    fun inject(phoneInfoFragment: PhoneInfoFragment)
    fun inject(torangDeviceManagerTestActivity: TorangDeviceManagerTestActivity)
}