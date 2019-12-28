package io.seroo.core.service.repository

import io.seroo.core.service.api.SampleService
import io.seroo.core.service.data.SampleDataAtData

class SampleRemoteDataSource(
    private val sampleService: SampleService
) {

    suspend fun getTimeoutExceptionApi(): List<SampleDataAtData> {
        return try {
            sampleService.getTimeOutExceptionRemoteService()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

    suspend fun getIOExceptionApi(): List<SampleDataAtData> {
        return try {
            sampleService.getIOExceptionRemoteService()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

    suspend fun getRemoteApi(): List<SampleDataAtData> {
        return sampleService.getSuccessRemoteService()
    }
}