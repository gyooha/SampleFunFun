package io.seroo.domain.interfaces

import io.seroo.domain.entities.SampleEntity

interface SampleRepository {
    suspend fun callRemoteApiAndSuccess(): List<SampleEntity>
    suspend fun callRemoteApiAndError(): List<SampleEntity>
}