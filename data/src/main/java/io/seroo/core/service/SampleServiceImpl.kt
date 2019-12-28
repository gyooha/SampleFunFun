package io.seroo.core.service

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import java.io.IOException
import java.util.concurrent.TimeoutException

class SampleServiceImpl : SampleService {
    override suspend fun getSuccessRemoteService(): List<SampleData> = coroutineScope {
        delay(2000)

        listOf(
            SampleData(
                "1",
                "https://images-na.ssl-images-amazon.com/images/I/51ceib19gTL.jpg",
                "Lorem Ipsum",
                "seroo"
            ),
            SampleData(
                "2",
                "https://i1.sndcdn.com/avatars-000346754693-nv5kv9-t500x500.jpg",
                "Lorem Ipsum",
                "seroo"
            ),
            SampleData(
                "3",
                "https://pbs.twimg.com/profile_images/674332051550654464/nIFOv0JF_400x400.jpg",
                "Lorem Ipsum",
                "seroo"
            ),
            SampleData(
                "4",
                "https://pbs.twimg.com/profile_images/983589422070251520/HvSy4176_400x400.jpg",
                "Lorem Ipsum",
                "seroo"
            )
        )
    }

    override suspend fun getTimeOutExceptionRemoteService(): List<SampleData> = coroutineScope {
        delay(5000)

        throw TimeoutException("invalid data")
    }


    override suspend fun getIOExceptionRemoteService(): List<SampleData> = coroutineScope {
        delay(5000)

        throw IOException("invalid data")
    }
}