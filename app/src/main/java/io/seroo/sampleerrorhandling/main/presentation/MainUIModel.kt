package io.seroo.sampleerrorhandling.main.presentation

import io.seroo.core.service.RemoteData

data class MainItem(
    val id: String,
    val imageUri: String,
    val title: String
)

fun RemoteData.toMainItem(): MainItem {
    return MainItem(id, imagePath, title)
}