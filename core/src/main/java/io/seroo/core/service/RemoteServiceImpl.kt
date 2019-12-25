package io.seroo.core.service

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

class RemoteServiceImpl : RemoteService {
    override suspend fun getSuccessRemoteService(): List<RemoteData> = coroutineScope {
        delay(2000)

        listOf(
            RemoteData(
                "1",
                "https://images-na.ssl-images-amazon.com/images/I/51ceib19gTL.jpg",
                "Lorem Ipsum",
                "seroo"
            ),
            RemoteData(
                "2",
                "https://i1.sndcdn.com/avatars-000346754693-nv5kv9-t500x500.jpg",
                "Lorem Ipsum",
                "seroo"
            ),
            RemoteData(
                "3",
                "https://pbs.twimg.com/profile_images/674332051550654464/nIFOv0JF_400x400.jpg",
                "Lorem Ipsum",
                "seroo"
            ),
            RemoteData(
                "4",
                "https://pbs.twimg.com/profile_images/983589422070251520/HvSy4176_400x400.jpg",
                "Lorem Ipsum",
                "seroo"
            )
        )
    }

    override suspend fun getErrorRemoteService(): List<RemoteData> = coroutineScope {
        delay(5000)

        throw IllegalStateException("invalid data")
    }
}