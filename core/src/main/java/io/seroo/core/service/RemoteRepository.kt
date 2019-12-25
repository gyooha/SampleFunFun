package io.seroo.core.service

class RemoteRepository(
    private val remoteDataSource: RemoteDataSource
) {

    suspend fun callRemoteApiAndError(): List<RemoteData> {
        return remoteDataSource.remoteApiCallAndError()
    }

    suspend fun callRemoteApiAndSuccess(): List<RemoteData> {
        return remoteDataSource.remoteApiCallAndSuccess()
    }
}