package com.example.devicemanager

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import com.example.devicemanager.databinding.LayoutDeviceInfoBinding

class DeviceUtil {
    fun showDialogDeviceInfo(context: Context){
        val d = Dialog(context)
        val v = LayoutDeviceInfoBinding.inflate(LayoutInflater.from(context))
        d.setContentView(v.root)
        d.show()
    }
}