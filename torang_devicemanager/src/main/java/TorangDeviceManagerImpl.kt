import android.content.Context
import com.sarang.torangdatamodel.model.DeviceInfo
import com.sarang.torangdi.TorangDeviceManager
import com.example.devicemanager.DeviceManager

class TorangDeviceManagerImpl(val context: Context) : TorangDeviceManager {
    val deviceManager = DeviceManager(context)

    override fun getDeviceInfo(): DeviceInfo {
        val uuid = deviceManager.getUUID()
        val model = ""
        val version = 0
        val timeZone = ""
        val language = ""
        val serial = ""

        return DeviceInfo(uuid, model, version, serial, timeZone, language)
    }
}