package io.seroo.sampleerrorhandling.main.presentation

import io.seroo.sampleerrorhandling.common.BaseDiffUtilCallback

class MainDiffUtilCallback(
    private val oldItem: List<MainItem>,
    private val newItem: List<MainItem>
) : BaseDiffUtilCallback<MainItem>(oldItem, newItem) {
    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItem[oldItemPosition].id == newItem[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItem[oldItemPosition].id == newItem[newItemPosition].id
    }
}