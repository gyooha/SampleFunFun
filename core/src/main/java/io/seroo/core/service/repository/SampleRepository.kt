package io.seroo.core.service.repository

import io.seroo.common.FunResult
import io.seroo.core.service.data.SampleData

class SampleRepository(
    private val remoteRemoteDataSource: SampleRemoteDataSource
) {

    private val sampleDataAtDomainCache: HashMap<String, List<SampleData>> = hashMapOf()

    suspend fun getIOExceptionApi(): FunResult<List<SampleData>> {
        val response = remoteRemoteDataSource.getTimeoutExceptionApi()

        if (response is FunResult.Success) {
            // do memory cache
        }

        return response
    }

    suspend fun getTimeoutExceptionApi(): FunResult<List<SampleData>> {
        val response = remoteRemoteDataSource.getTimeoutExceptionApi()

        if (response is FunResult.Success) {
            // do memory cache
        }

        return response
    }

    suspend fun getSampleData(): FunResult<List<SampleData>> {
        val response = remoteRemoteDataSource.getSampleData()

        if (response is FunResult.Success) {
            // do memory cache
        }

        return response
    }
}