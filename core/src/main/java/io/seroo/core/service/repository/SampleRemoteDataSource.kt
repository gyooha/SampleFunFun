package io.seroo.core.service.repository

import io.seroo.common.FunResult
import io.seroo.core.service.api.SampleService
import io.seroo.core.service.data.SampleData

class SampleRemoteDataSource(
    private val sampleService: SampleService
) {

    suspend fun getTimeoutExceptionApi(): FunResult<List<SampleData>> {
        return FunResult.safeCall {
            sampleService.getTimeOutExceptionRemoteService()
        }
    }

    suspend fun getIOExceptionApi(): FunResult<List<SampleData>> {
        return FunResult.safeCall {
            sampleService.getIOExceptionRemoteService()
        }
    }

    suspend fun getSampleData(): FunResult<List<SampleData>> {
        return FunResult.safeCall {
            sampleService.getSampleData()
        }
    }

    suspend fun getRemoteApi(): List<SampleData> {
        return try {
            sampleService.getSampleData()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

    suspend fun getAny(): Any {
        return try {
            sampleService.getSampleData()
        } catch (e: Exception) {
            e.printStackTrace()
            e
        }
    }
}