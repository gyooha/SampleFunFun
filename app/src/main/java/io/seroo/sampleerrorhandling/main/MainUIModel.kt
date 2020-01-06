package io.seroo.sampleerrorhandling.main

import io.seroo.core.service.data.SampleData

data class MainItem(
    val id: String,
    val imageUri: String,
    val title: String
)

fun SampleData.toMainItem(): MainItem {
    return MainItem(id, imagePath, title)
}