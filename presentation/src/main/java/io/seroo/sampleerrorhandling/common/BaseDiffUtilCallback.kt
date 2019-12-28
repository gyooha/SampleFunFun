package io.seroo.sampleerrorhandling.common

import androidx.recyclerview.widget.DiffUtil

abstract class BaseDiffUtilCallback<out T>(
    private val oldItem: List<T>,
    private val newItem: List<T>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldItem.size

    override fun getNewListSize(): Int = newItem.size
}