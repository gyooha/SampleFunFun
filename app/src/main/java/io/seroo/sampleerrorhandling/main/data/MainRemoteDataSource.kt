package io.seroo.sampleerrorhandling.main.data

import io.seroo.core.RemoteData
import io.seroo.core.RemoteService

class MainRemoteDataSource(
    private val remoteService: RemoteService
) {

    suspend fun remoteApiCallAndError(): List<RemoteData> {
        return remoteService.getErrorRemoteService()
    }

    suspend fun remoteApiCallAndSuccess(): List<RemoteData> {
        return remoteService.getSuccessRemoteService()
    }
}