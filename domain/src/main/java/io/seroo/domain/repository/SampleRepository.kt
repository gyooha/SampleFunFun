package io.seroo.domain.repository

import io.seroo.common.FunResult
import io.seroo.domain.data.SampleDataAtDomain

interface SampleRepository {
    suspend fun getRemoteApi(): FunResult<List<SampleDataAtDomain>>
    suspend fun getIOExceptionApi(): FunResult<List<SampleDataAtDomain>>
    suspend fun getTimeoutExceptionApi(): FunResult<List<SampleDataAtDomain>>
}