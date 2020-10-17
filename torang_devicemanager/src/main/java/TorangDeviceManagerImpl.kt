import android.content.Context
import com.sarang.torangdatamodel.model.DeviceInfo
import com.sarang.torangdi.TorangDeviceManager
import com.example.devicemanager.DeviceManager

class TorangDeviceManagerImpl(val context: Context) : TorangDeviceManager {
    val deviceManager = DeviceManager(context)

    override fun getDeviceInfo(): DeviceInfo {
        return DeviceInfo()
    }
}