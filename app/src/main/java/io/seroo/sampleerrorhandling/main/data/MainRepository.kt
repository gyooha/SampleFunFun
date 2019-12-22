package io.seroo.sampleerrorhandling.main.data

import io.seroo.core.service.RemoteData

class MainRepository(
    private val mainRemoteDataSource: MainRemoteDataSource
) {

    suspend fun callRemoteApiAndError(): List<RemoteData> {
        return mainRemoteDataSource.remoteApiCallAndError()
    }

    suspend fun callRemoteApiAndSuccess(): List<RemoteData> {
        return mainRemoteDataSource.remoteApiCallAndSuccess()
    }
}