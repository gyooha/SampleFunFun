package io.seroo.core.service.repository

import io.seroo.common.FunResult
import io.seroo.core.service.api.SampleService
import io.seroo.core.service.data.SampleDataAtData

class SampleRemoteDataSource(
    private val sampleService: SampleService
) {

    suspend fun getTimeoutExceptionApi(): FunResult<List<SampleDataAtData>> {
        return FunResult.safeCall {
            sampleService.getTimeOutExceptionRemoteService()
        }
    }

    suspend fun getIOExceptionApi(): FunResult<List<SampleDataAtData>> {
        return FunResult.safeCall {
            sampleService.getIOExceptionRemoteService()
        }
    }

    suspend fun getRemoteApi(): FunResult<List<SampleDataAtData>> {
        return FunResult.safeCall {
            sampleService.getSuccessRemoteService()
        }
    }
}