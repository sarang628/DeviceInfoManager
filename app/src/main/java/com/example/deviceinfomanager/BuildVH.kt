package com.example.deviceinfomanager

import androidx.recyclerview.widget.RecyclerView
import com.example.deviceinfomanager.databinding.ItemBuildBinding

class BuildVH(itemView: ItemBuildBinding) : RecyclerView.ViewHolder(itemView.root) {
    val itemBuildBinding : ItemBuildBinding = itemView

    fun setData(title: String, value: String) {
        itemBuildBinding.title.text = title
        itemBuildBinding.value.text = value
    }
}