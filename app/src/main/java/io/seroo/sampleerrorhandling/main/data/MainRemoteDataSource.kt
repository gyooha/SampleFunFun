package io.seroo.sampleerrorhandling.main.data

import io.seroo.core.service.RemoteData
import io.seroo.core.service.RemoteService

class MainRemoteDataSource(
    private val remoteService: RemoteService
) {

    suspend fun remoteApiCallAndError(): List<RemoteData> {
        return try {
            remoteService.getErrorRemoteService()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

    suspend fun remoteApiCallAndSuccess(): List<RemoteData> {
        return remoteService.getSuccessRemoteService()
    }
}