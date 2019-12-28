package io.seroo.domain.repository

import io.seroo.domain.data.SampleDataAtDomain

interface SampleRepository {
    suspend fun getRemoteApi(): List<SampleDataAtDomain>
    suspend fun getIOExceptionApi(): List<SampleDataAtDomain>
    suspend fun getTimeoutExceptionApi(): List<SampleDataAtDomain>
}