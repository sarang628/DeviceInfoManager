package com.example.deviceinfomanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.deviceinfomanager.databinding.FragmentBuildInfoBinding
import com.example.devicemanager.DeviceManager

class ScreenInfoFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_build_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentBuildInfoBinding = FragmentBuildInfoBinding.bind(view)
        val deviceManager = DeviceManager()
        fragmentBuildInfoBinding.buildRv.adapter = BuildRvAdt()
        (fragmentBuildInfoBinding.buildRv.adapter as BuildRvAdt).apply {
            setData(ArrayList<BuildData>().apply {
                add(BuildData("Density", deviceManager.getDensity(context!!).toString()))
                add(BuildData("DensityDpi", deviceManager.getDensityDpi(context!!).toString()))
                add(BuildData("DisplayId", deviceManager.getDisplayId(context!!).toString()))
                add(BuildData("HeightPixels", deviceManager.getHeightPixels(context!!).toString()))
                add(BuildData("RefreshRate", deviceManager.getRefreshRate(context!!).toString()))
                add(BuildData("Rotation", deviceManager.getRotation(context!!).toString()))
                add(
                    BuildData(
                        "ScaledDensity",
                        deviceManager.getScaledDensity(context!!).toString()
                    )
                )
                add(BuildData("WidthPixels", deviceManager.getWidthPixels(context!!).toString()))
                add(BuildData("xDpi", deviceManager.getxDpi(context!!).toString()))
                add(BuildData("yDpi", deviceManager.getyDpi(context!!).toString()))
            })
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ScreenInfoFragment()
    }
}