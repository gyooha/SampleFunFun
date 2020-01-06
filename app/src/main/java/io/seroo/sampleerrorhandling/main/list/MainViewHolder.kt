package io.seroo.sampleerrorhandling.main.list

import com.bumptech.glide.Glide
import io.seroo.sampleerrorhandling.common.BaseViewHolder
import io.seroo.sampleerrorhandling.databinding.MainViewHolderBinding
import io.seroo.sampleerrorhandling.main.MainItem

class MainViewHolder(
    private val binding: MainViewHolderBinding
) : BaseViewHolder.ViewHolder<MainItem>(binding.root) {
    override fun bindView(item: MainItem, position: Int) {
        Glide.with(itemView.context)
            .load(item.imageUri)
            .centerCrop()
            .into(binding.banner)

        binding.title.text = item.title
    }
}