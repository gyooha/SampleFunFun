package io.seroo.core.service.data

import io.seroo.domain.data.SampleDataAtDomain

data class SampleDataAtData(
    val id: String,
    val imagePath: String,
    val title: String,
    val description: String
) {
    fun toSampleEntity() = SampleDataAtDomain(
        id,
        imagePath,
        title,
        description
    )
}