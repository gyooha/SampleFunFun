package io.seroo.sampleerrorhandling.main.presentation

import com.bumptech.glide.Glide
import io.seroo.sampleerrorhandling.common.BaseViewHolder
import io.seroo.sampleerrorhandling.databinding.MainViewHolderBinding

class MainViewHolder(
    private val binding: MainViewHolderBinding
) : BaseViewHolder.ViewHolder<MainItem>(binding.root) {
    override fun bindView(item: MainItem, position: Int) {
        Glide.with(itemView.context)
            .load(item.imageUri)
            .override(320, 300)
            .centerCrop()
            .into(binding.banner)

        binding.title.text = item.title
    }
}