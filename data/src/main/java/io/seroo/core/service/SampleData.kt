package io.seroo.core.service

import io.seroo.domain.entities.SampleEntity

data class SampleData(
    val id: String,
    val imagePath: String,
    val title: String,
    val description: String
) {
    fun toSampleEntity() = SampleEntity(
        id,
        imagePath,
        title,
        description
    )
}