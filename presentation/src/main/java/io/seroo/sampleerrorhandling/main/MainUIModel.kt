package io.seroo.sampleerrorhandling.main

import io.seroo.domain.data.SampleDataAtDomain

data class MainItem(
    val id: String,
    val imageUri: String,
    val title: String
)

fun SampleDataAtDomain.toMainItem(): MainItem {
    return MainItem(id, imagePath, title)
}