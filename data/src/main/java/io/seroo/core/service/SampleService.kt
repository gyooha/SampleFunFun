package io.seroo.core.service

interface SampleService {

    suspend fun getSuccessRemoteService(): List<SampleData>
    suspend fun getTimeOutExceptionRemoteService(): List<SampleData>
    suspend fun getIOExceptionRemoteService(): List<SampleData>
}