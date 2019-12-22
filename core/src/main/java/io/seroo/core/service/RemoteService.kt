package io.seroo.core.service

import io.seroo.core.service.RemoteData

interface RemoteService {

    suspend fun getSuccessRemoteService(): List<RemoteData>
    suspend fun getErrorRemoteService(): List<RemoteData>
}