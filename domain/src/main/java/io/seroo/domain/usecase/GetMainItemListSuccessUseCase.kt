package io.seroo.domain.usecase

import io.seroo.domain.repository.SampleRepository
import io.seroo.domain.data.SampleDataAtDomain

class GetMainItemListSuccessUseCase(
    private val remoteRepository: SampleRepository
) {

    suspend operator fun invoke(): List<SampleDataAtDomain> {
        return remoteRepository.getRemoteApi()
    }
}