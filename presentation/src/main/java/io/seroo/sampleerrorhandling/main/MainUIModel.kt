package io.seroo.sampleerrorhandling.main

import io.seroo.domain.entities.SampleEntity

data class MainItem(
    val id: String,
    val imageUri: String,
    val title: String
)

fun SampleEntity.toMainItem(): MainItem {
    return MainItem(id, imagePath, title)
}