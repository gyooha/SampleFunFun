package io.seroo.core.service

class RemoteDataSource(
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