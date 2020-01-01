package io.seroo.core.service.repository

import io.seroo.domain.repository.SampleRepository
import io.seroo.domain.data.SampleDataAtDomain

class SampleRepositoryImpl(
    private val remoteRemoteDataSource: SampleRemoteDataSource
) : SampleRepository {

    override suspend fun getIOExceptionApi(): List<SampleDataAtDomain> {
        val response = remoteRemoteDataSource.getTimeoutExceptionApi()
            .map { it.toSampleEntity() }

        return response
    }

    override suspend fun getTimeoutExceptionApi(): List<SampleDataAtDomain> {
        val response = remoteRemoteDataSource.getTimeoutExceptionApi()
            .map { it.toSampleEntity() }

        return response
    }

    override suspend fun getRemoteApi(): List<SampleDataAtDomain> {
        return remoteRemoteDataSource.getRemoteApi()
            .map { it.toSampleEntity() }
    }
}