package io.seroo.core.service

class SampleRemoteDataSource(
    private val sampleService: SampleService
) {

    suspend fun remoteApiCallAndError(): List<SampleData> {
        return try {
            sampleService.getTimeOutExceptionRemoteService()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

    suspend fun remoteApiCallAndSuccess(): List<SampleData> {
        return sampleService.getSuccessRemoteService()
    }
}