package io.seroo.core.service.repository

import io.seroo.common.FunResult
import io.seroo.common.map
import io.seroo.domain.repository.SampleRepository
import io.seroo.domain.data.SampleDataAtDomain

class SampleRepositoryImpl(
    private val remoteRemoteDataSource: SampleRemoteDataSource
) : SampleRepository {

    private val sampleDataAtDomainCache: HashMap<String, List<SampleDataAtDomain>> = hashMapOf()

    override suspend fun getIOExceptionApi(): FunResult<List<SampleDataAtDomain>> {
        val response = remoteRemoteDataSource.getTimeoutExceptionApi()
            .map { it.map { it.toSampleEntity() } }

        if (response is FunResult.Success) {
            // do memory cache
        }

        return response
    }

    override suspend fun getTimeoutExceptionApi(): FunResult<List<SampleDataAtDomain>> {
        val response = remoteRemoteDataSource.getTimeoutExceptionApi()
            .map { it.map { it.toSampleEntity() } }

        if (response is FunResult.Success) {
            // do memory cache
        }

        return response
    }

    override suspend fun getRemoteApi(): FunResult<List<SampleDataAtDomain>> {
        val response = remoteRemoteDataSource.getRemoteApi()
            .map { it.map { it.toSampleEntity() } }

        if (response is FunResult.Success) {
            // do memory cache
        }

        return response
    }
}