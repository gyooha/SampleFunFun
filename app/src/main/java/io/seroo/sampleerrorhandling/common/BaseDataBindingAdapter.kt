package io.seroo.sampleerrorhandling.common

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@Suppress("UNCHECKED_CAST")
@BindingAdapter("submitList")
fun <T> bindRecyclerView(
    view: RecyclerView?,
    itemList: List<T>?
) {
    if (itemList != null) {
        (view?.adapter as? BaseAdapter<T>)?.run {
            submitItem(itemList)
        }
    }
}

@BindingAdapter("bindAdapter")
fun <T> bindRecyclerViewWithAdapter(
    view: RecyclerView?,
    adapter: BaseAdapter<T>?
) {
    if (adapter != null) {
        view?.let { actualAdapter ->
            actualAdapter.adapter = adapter
        }
    }
}