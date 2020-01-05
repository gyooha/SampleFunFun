package io.seroo.domain.usecase

import io.seroo.common.FunResult
import io.seroo.domain.data.SampleDataAtDomain
import io.seroo.domain.repository.SampleRepository

class GetMainItemListSuccessUseCase(
    private val remoteRepository: SampleRepository
) {

    suspend operator fun invoke(): FunResult<List<SampleDataAtDomain>> {
        return remoteRepository.getRemoteApi()
    }
}