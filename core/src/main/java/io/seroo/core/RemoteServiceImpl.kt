package io.seroo.core

class RemoteServiceImpl: RemoteService {
    override fun getRemoteService(): List<RemoteData> {
        return listOf(
            // TODO dummyData
        )
    }

    override fun getErrorRemoteService(): List<RemoteData> {
        throw IllegalStateException("invalid data")
    }
}