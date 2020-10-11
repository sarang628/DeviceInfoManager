package com.example.devicemanager

import android.content.Context
import com.example.srteleponymanager.SrTeleponyManagerModule
import dagger.Module
import dagger.Provides

@Module
class DeviceManagerModule constructor(val context: Context?) {
    @Provides
    fun provideDeviceManager(): DeviceManager {
        return DeviceManager(context!!)
    }
}