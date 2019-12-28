package io.seroo.core.service

import io.seroo.domain.interfaces.SampleRepository
import io.seroo.domain.entities.SampleEntity

class SampleRepositoryImpl(
    private val remoteRemoteDataSource: SampleRemoteDataSource
) : SampleRepository {

    private val sampleDataCache: HashMap<String, List<SampleData>> = hashMapOf()

    override suspend fun callRemoteApiAndError(): List<SampleEntity> {
        val response = remoteRemoteDataSource.remoteApiCallAndError()
            .map { it.toSampleEntity() }

        return response
    }

    override suspend fun callRemoteApiAndSuccess(): List<SampleEntity> {
        return remoteRemoteDataSource.remoteApiCallAndSuccess()
            .map { it.toSampleEntity() }
    }
}