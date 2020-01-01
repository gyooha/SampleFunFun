package io.seroo.core.service.api

import io.seroo.core.service.data.SampleDataAtData

interface SampleService {
    suspend fun getSuccessRemoteService(): List<SampleDataAtData>
    suspend fun getTimeOutExceptionRemoteService(): List<SampleDataAtData>
    suspend fun getIOExceptionRemoteService(): List<SampleDataAtData>
}