package com.example.deviceinfomanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.deviceinfomanager.databinding.FragmentBuildInfoBinding
import com.example.deviceinfomanager.databinding.FragmentPhoneInfoBinding
import com.example.devicemanager.DeviceManager
import javax.inject.Inject

class PhoneInfoFragment : Fragment() {

    @Inject
    lateinit var deviceManager: DeviceManager;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity?.application as DeviceManagerApplication).appComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentBuildInfoBinding = FragmentPhoneInfoBinding.bind(view)
        fragmentBuildInfoBinding.rvPhone.adapter = BuildRvAdt()
        (fragmentBuildInfoBinding.rvPhone.adapter as BuildRvAdt).apply {
            setData(ArrayList<BuildData>().apply {
                add(BuildData("imei", deviceManager.srTelephonyManager.getImei()))

            })
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = PhoneInfoFragment()
    }
}