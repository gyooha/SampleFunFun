package io.seroo.core.service

class RemoteRepository(
    private val remoteDataSource: RemoteDataSource
) {

    private val remoteDataCache: HashMap<String, List<RemoteData>> = hashMapOf()

    suspend fun callRemoteApiAndError(): List<RemoteData> {
        val response = remoteDataSource.remoteApiCallAndError()

        return response
    }

    suspend fun callRemoteApiAndSuccess(): List<RemoteData> {
        return remoteDataSource.remoteApiCallAndSuccess()
    }
}