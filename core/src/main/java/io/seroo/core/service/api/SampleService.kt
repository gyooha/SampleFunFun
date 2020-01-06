package io.seroo.core.service.api

import io.seroo.core.service.data.SampleData

interface SampleService {

    suspend fun getSampleData(): List<SampleData>
    suspend fun getTimeOutExceptionRemoteService(): List<SampleData>
    suspend fun getIOExceptionRemoteService(): List<SampleData>
}