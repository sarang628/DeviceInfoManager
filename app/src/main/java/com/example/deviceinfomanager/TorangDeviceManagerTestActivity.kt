package com.example.deviceinfomanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sarang.torangdi.TorangDeviceManager
import javax.inject.Inject

class TorangDeviceManagerTestActivity : AppCompatActivity() {
    val TAG = "__TorangDeviceManagerTestActivity"

    @Inject
    lateinit var torangDeviceManager: TorangDeviceManager

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as DeviceManagerApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torang_device_manager_test)

        Log.d(TAG, "${torangDeviceManager.deviceInfo}")
    }
}