package io.seroo.sampleerrorhandling.common

import android.view.View
import androidx.recyclerview.widget.RecyclerView

sealed class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    abstract class ViewHolder<T>(view: View) : BaseViewHolder(view) {
        abstract fun bindView(item: T, position: Int)
    }
}