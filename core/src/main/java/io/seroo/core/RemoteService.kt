package io.seroo.core

interface RemoteService {

    suspend fun getSuccessRemoteService(): List<RemoteData>
    suspend fun getErrorRemoteService(): List<RemoteData>
}