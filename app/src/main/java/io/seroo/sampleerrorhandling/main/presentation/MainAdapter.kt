package io.seroo.sampleerrorhandling.main.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import io.seroo.sampleerrorhandling.common.BaseAdapter
import io.seroo.sampleerrorhandling.common.BaseViewHolder
import io.seroo.sampleerrorhandling.databinding.MainViewHolderBinding

class MainAdapter() : BaseAdapter<MainItem>() {
    override fun submitItem(newList: List<MainItem>) {
        val diffResult = DiffUtil.calculateDiff(MainDiffUtilCallback(itemList, newList))
        itemList.addAll(newList)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return MainViewHolder(
            MainViewHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        if (holder is MainViewHolder) {
            holder.bindView(getItem(position), position)
        }
    }
}