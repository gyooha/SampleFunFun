package io.seroo.sampleerrorhandling.common

import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T> : RecyclerView.Adapter<BaseViewHolder>() {
    protected val itemList: MutableList<T> = mutableListOf()

    abstract fun submitItem(newList: List<T>)

    protected fun getItem(position: Int) = itemList[position]

    override fun getItemCount(): Int = itemList.size
}