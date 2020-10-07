package com.example.deviceinfomanager

import com.example.devicemanager.DeviceManagerModule
import dagger.Component
import dagger.Module

@Component(modules = [DeviceManagerModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(screenInfoFragment: ScreenInfoFragment)
}