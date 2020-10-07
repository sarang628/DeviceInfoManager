package com.example.devicemanager

import dagger.Module
import dagger.Provides

@Module
class DeviceManagerModule {
    @Provides
    fun provideDeviceManager(): DeviceManager {
        return DeviceManager()
    }
}