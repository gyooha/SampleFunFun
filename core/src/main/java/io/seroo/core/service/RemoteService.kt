package io.seroo.core.service

interface RemoteService {

    suspend fun getSuccessRemoteService(): List<RemoteData>
    suspend fun getTimeOutExceptionRemoteService(): List<RemoteData>
    suspend fun getIOExceptionRemoteService(): List<RemoteData>
}