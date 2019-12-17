package io.seroo.core

interface RemoteService {

    fun getRemoteService(): List<RemoteData>
    fun getErrorRemoteService(): List<RemoteData>
}