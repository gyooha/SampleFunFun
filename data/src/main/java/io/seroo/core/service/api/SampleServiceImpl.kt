package io.seroo.core.service.api

import io.seroo.core.service.common.resultDataFromBackend
import io.seroo.core.service.data.SampleDataAtData
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import java.io.IOException
import java.util.concurrent.TimeoutException

class SampleServiceImpl : SampleService {
    override suspend fun getSuccessRemoteService(): List<SampleDataAtData> =
        coroutineScope {
            delay(2000)

            resultDataFromBackend
        }

    override suspend fun getTimeOutExceptionRemoteService(): List<SampleDataAtData> =
        coroutineScope {
            delay(5000)

            throw TimeoutException("invalid data")
        }


    override suspend fun getIOExceptionRemoteService(): List<SampleDataAtData> =
        coroutineScope {
            delay(5000)

            throw IOException("invalid data")
        }
}