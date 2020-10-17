package com.example.torang_devicemanager

import TorangDeviceManagerImpl
import android.content.Context
import com.sarang.torangdi.TorangDeviceManager
import dagger.Module
import dagger.Provides

@Module
class TorangDeviceManagerModule constructor(val context: Context) {
    @Provides
    fun provideTorangDeviceManager(): TorangDeviceManager {
        return TorangDeviceManagerImpl(context)
    }
}